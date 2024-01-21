package com.app.imdb.dto.recomDto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RecommendationResponseDto {
    private String filmTitle;
    private double averageScore;
    private String directorName;

}
