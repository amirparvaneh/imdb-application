package com.app.imdb.exception;

import com.app.imdb.global.ErrorResponse;
import org.springframework.http.HttpStatus;

public class UserDomainException extends ServiceException {

    private static final DomainCategory domain = DomainCategory.USER;

    public UserDomainException(String message, String errorCode, HttpStatus statusCode, Object... params) {
        super(new ErrorResponse(
                message,
                errorCode,
                statusCode,
                domain
        ));
    }

    public UserDomainException(String message, String errorCode, HttpStatus statusCode) {
        super(new ErrorResponse(
                message,
                errorCode,
                statusCode,
                domain
        ));
    }
}
