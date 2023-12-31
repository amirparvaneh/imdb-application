package com.app.imdb.global;

import com.app.imdb.exception.DomainCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private String message;
    private HttpStatus httpStatus;
    private DomainCategory domainCategory;
    private Object[] args;
}
