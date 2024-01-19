package com.app.imdb.service.impl;

import com.app.imdb.dto.UserRateRequestDto;
import com.app.imdb.dto.rateDto.RateResponseDto;
import com.app.imdb.mapper.RateMapper;
import com.app.imdb.model.Film;
import com.app.imdb.model.Rate;
import com.app.imdb.model.Score;
import com.app.imdb.model.User;
import com.app.imdb.repository.RateRepository;
import com.app.imdb.service.RateService;
import com.app.imdb.service.validation.ValidationService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RateServiceImpl implements RateService {

    private static final Logger log = LoggerFactory.getLogger(RateServiceImpl.class);
    private final RateRepository rateRepository;
    private final ValidationService validationService;
    private final  FilmServiceImpl filmService;
    private final UserServiceImpl userService;


    @Override
    public RateResponseDto rateFilm(UserRateRequestDto userRateRequestDto) {
        validationService.validateRequestRate(userRateRequestDto);
        Score rateScore = validationService.validateScore(userRateRequestDto.getScore());
        Film film = filmService.findFilm(userRateRequestDto.getFilmId());
        User user = userService.findUserByCode(userRateRequestDto.getUserCode());
        Rate rate = Rate.builder()
                .film(film)
                .user(user)
                .score(rateScore)
                .build();
        rateRepository.save(rate);
        filmService.averageRateForFilm(rate);
        return RateResponseDto.builder()
                .filmName(film.getTitle())
                .userName(user.getFirstName() + "_" + user.getLastName())
                .score(rateScore)
                .build();
    }

}
