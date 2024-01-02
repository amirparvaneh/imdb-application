package com.app.imdb.exception;

import com.app.imdb.global.ErrorResponse;
import org.springframework.http.HttpStatus;

public class FilmDomainException extends ServiceException{
    private static final DomainCategory domain = DomainCategory.FILM;


    public FilmDomainException(String message, String errorCode, HttpStatus statusCode,Object... param){
        super(new ErrorResponse(
                message,
                errorCode,
                statusCode,
                domain,
                param
        ));
    }

    public FilmDomainException(String message, String errorCode, HttpStatus statusCode){
        super(new ErrorResponse(
                message,
                errorCode,
                statusCode,
                domain
        ));
    }

}
