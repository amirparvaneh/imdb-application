package com.app.imdb.dto.userDto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;


@Data
@Builder
public class UserRateRequestDto implements Serializable {
    private String score;
    private Long userCode;
    private Long filmId;
}
