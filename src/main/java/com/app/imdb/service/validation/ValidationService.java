package com.app.imdb.service.validation;


import com.app.imdb.dto.UserRateRequestDto;
import com.app.imdb.model.Film;
import com.app.imdb.model.User;
import com.app.imdb.service.impl.FilmServiceImpl;
import com.app.imdb.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ValidationService {

    private final UserServiceImpl userService;
    private final FilmServiceImpl filmService;

    public void validateRequestRate(UserRateRequestDto userRateRequestDto) {
        userService.findUserByCode(userRateRequestDto.getUserCode());
        filmService.findFilm(userRateRequestDto.getFilmId());
    }
}
