package com.app.imdb.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;


@Data
@Builder
public class UserRateRequestDto implements Serializable {
    private Integer score;
    private Long userCode;
    private Long filmId;
}
