package com.app.imdb.exception;

import com.app.imdb.global.ErrorResponse;
import org.springframework.http.HttpStatus;

public class OtherDomainException extends ServiceException{
    private static final DomainCategory domain = DomainCategory.OTHER;

    public OtherDomainException(String message, String errorCode, HttpStatus statusCode, Object... param){
        super(new ErrorResponse(
                message,
                errorCode,
                statusCode,
                domain,
                param
        ));
    }
}
