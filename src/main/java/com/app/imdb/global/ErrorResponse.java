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
    private String message;
    private HttpStatus statusCode;
    private ErrorConstants errorConstants;
    private DomainCategory domainCategory;
    private final Map<String, Object> errorDetail = new HashMap<>();
    private Object[] params;

    public ErrorResponse(String message,
                         HttpStatus statusCode,
                         ErrorConstants errorConstants,
                         DomainCategory domainCategory,
                         Object... params) {
        this.message = message;
        this.statusCode = statusCode;
        this.errorConstants = errorConstants;
        this.domainCategory = domainCategory;
        if (Objects.nonNull(params)) {
            setErrorDetail(params);
        }
    }
    public ErrorResponse(String message){
        this.message = message;
    }

    private void setErrorDetail(Object... params) {
        for (Object param : params) {
            this.errorDetail.put("request param :", param);
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
