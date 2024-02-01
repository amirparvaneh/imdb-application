package com.app.imdb.dto.recomDto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecommendationRequestDto {
    private Long userCode;
    private String filmTitle;
    private String recommendationBase;
}
