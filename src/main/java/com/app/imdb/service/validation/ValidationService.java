package com.app.imdb.service.validation;


import com.app.imdb.dto.userDto.UserRateRequestDto;
import com.app.imdb.exception.ErrorConstants;
import com.app.imdb.exception.OtherDomainException;
import com.app.imdb.exception.RecommendationDomainException;
import com.app.imdb.model.*;
import com.app.imdb.service.impl.FilmServiceImpl;
import com.app.imdb.service.impl.UserServiceImpl;
import jakarta.servlet.annotation.ServletSecurity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ValidationService {

    private static final EnumValidation<Score> scoreValidation = new EnumValidation<>(Score.class);
    private static final EnumValidation<RecommendationBase> recommendationBaseValidation =
            new EnumValidation<>(RecommendationBase.class);
    private final UserServiceImpl userService;
    private final FilmServiceImpl filmService;

    public void validateRequestRate(UserRateRequestDto userRateRequestDto) {
        userService.findUserByCode(userRateRequestDto.getUserCode());
        filmService.findFilm(userRateRequestDto.getFilmId());
    }

    public Score validateScore(String inputScore) {
        if (scoreValidation.isValidType(inputScore)) {
            return scoreValidation.getEnumType(inputScore);
        } else {
            throw new OtherDomainException("not valid enum", ErrorConstants.NOT_VALID_ENUM,
                    HttpStatus.BAD_REQUEST, inputScore);
        }
    }

    public RecommendationBase getRecommendationBase(String recommendationBase) {
        if (recommendationBaseValidation.isValidType(recommendationBase)) {
            return recommendationBaseValidation.getEnumType(recommendationBase);
        } else {
            throw new RecommendationDomainException("bad input", ErrorConstants.NOT_VALID_ENUM, HttpStatus.BAD_REQUEST,
                    recommendationBase);
        }
    }

    public User validateUser(Long userCode){

    }

    public Film validateFilmTitle(String filmTitle){

    }
}
