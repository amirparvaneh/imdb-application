package com.app.imdb.service.recommendationStrategy;

import com.app.imdb.dto.recomDto.RecommendationRequestDto;


public interface RecommendationStrategy {
    void checkBaseRecommendation(RecommendationRequestDto recommendation);
}
