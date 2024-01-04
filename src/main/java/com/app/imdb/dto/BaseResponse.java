package com.app.imdb.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class BaseResponse<T> implements Serializable {
    private String message;
    private T result;
}
