package com.app.imdb.exception;

import com.app.imdb.global.ErrorResponse;


/**
 * @author : amir_parvaneh
 * @created : 1/5/24_11:45 AM
 */

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
