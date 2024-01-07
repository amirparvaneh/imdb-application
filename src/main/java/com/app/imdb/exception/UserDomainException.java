package com.app.imdb.exception;

import com.app.imdb.global.ErrorResponse;
import com.app.imdb.model.User;
import org.springframework.http.HttpStatus;

public class UserDomainException extends ServiceException{
    private static final DomainCategory domain = DomainCategory.USER;
    public UserDomainException(Long userId){
        super(new ErrorResponse(
                "not.found",
                ErrorConstants.WRONG_FILM,
                HttpStatus.NOT_FOUND,
                domain
        ));
    }
}
