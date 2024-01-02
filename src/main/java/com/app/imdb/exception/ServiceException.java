package com.app.imdb.exception;

import com.app.imdb.global.ErrorResponse;


public class ServiceException extends RuntimeException {

    private ErrorResponse errorResponse;

    public ServiceException() {
    }

    public ServiceException(ErrorResponse errorResponse) {
        super(errorResponse.getMessage());
        this.errorResponse = errorResponse;
    }


    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }
}
