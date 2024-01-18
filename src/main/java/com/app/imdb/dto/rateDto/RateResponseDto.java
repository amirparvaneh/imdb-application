package com.app.imdb.dto.rateDto;

import com.app.imdb.model.Score;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RateResponseDto {
    private Score score;
    private String userName;
    private String filmName;
}
