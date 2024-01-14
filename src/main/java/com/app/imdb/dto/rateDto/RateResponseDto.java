package com.app.imdb.dto.rateDto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RateResponseDto {
    private Integer score;
    private String userName;
    private String filmName;
}
