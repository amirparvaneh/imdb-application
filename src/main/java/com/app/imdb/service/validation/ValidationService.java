package com.app.imdb.service.validation;


import com.app.imdb.dto.UserRateRequestDto;
import com.app.imdb.exception.ErrorConstants;
import com.app.imdb.exception.OtherDomainException;
import com.app.imdb.model.Score;
import com.app.imdb.service.impl.FilmServiceImpl;
import com.app.imdb.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ValidationService {

    private static final EnumValidation<Score> scoreValidation = new EnumValidation<>(Score.class);
    private final UserServiceImpl userService;
    private final FilmServiceImpl filmService;

    public void validateRequestRate(UserRateRequestDto userRateRequestDto) {
        userService.findUserByCode(userRateRequestDto.getUserCode());
        filmService.findFilm(userRateRequestDto.getFilmId());
    }

    public Score validateScore(String inputScore){
        if (scoreValidation.isValidType(inputScore)){
            return scoreValidation.getEnumType(inputScore);
        }else {
            throw new OtherDomainException("not valid enum", ErrorConstants.NOT_VALID_ENUM,
                    HttpStatus.BAD_REQUEST, inputScore);
        }
    }
}
