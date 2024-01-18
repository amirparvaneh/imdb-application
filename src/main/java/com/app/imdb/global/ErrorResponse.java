package com.app.imdb.global;

import com.app.imdb.exception.DomainCategory;
import com.app.imdb.exception.ErrorConstants;
import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;


@Builder
@Getter
@NoArgsConstructor
public class ErrorResponse {

    @Setter
    private String message;
    private String errorCode;
    private HttpStatus statusCode;
    private DomainCategory domainCategory;
    private final Map<String, Object> errorDetail = new HashMap<>();
    private Object[] params;

    public ErrorResponse(String message,
                         String errorCode,
                         HttpStatus statusCode,
                         DomainCategory domainCategory,
                         Object... params) {
        this.message = message;
        this.errorCode = errorCode;
        this.statusCode = statusCode;
        this.domainCategory = domainCategory;
        if (Objects.nonNull(params)) {
            setErrorDetail(params);
        }
    }

    public ErrorResponse(String message, String errorCode, HttpStatus statusCode, DomainCategory domainCategory) {
        this.message = message;
        this.errorCode = errorCode;
        this.statusCode = statusCode;
        this.domainCategory = domainCategory;
    }

    private void setErrorDetail(Object... params) {
        for (Object param : params) {
            this.errorDetail.put("request param :", param);
        }
    }
}
