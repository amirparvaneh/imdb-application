package com.app.imdb.global;

import com.app.imdb.exception.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Locale;

@RestControllerAdvice
public class ExceptionHandlerAdvice extends ResponseEntityExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);

    private MessageSource messageSource;

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<ErrorResponse> serviceExceptionHandler(ServiceException exception) {
        log.info("the exception domain is : " + exception.getErrorResponse().getDomainCategory());
        exception.getErrorResponse().setMessage(messageSource.getMessage(
                exception.getErrorResponse().getMessage(),
                exception.getErrorResponse().getParams(),
                Locale.getDefault()));
        return new ResponseEntity<>(exception.getErrorResponse(),exception.getErrorResponse().getStatusCode());
    }
}
