package com.app.imdb.dto.recomDto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RecommendationResponseDto {
    private String genre;
    private String filmTitle;
    private Double averageScore;
    private String directorName;
}
