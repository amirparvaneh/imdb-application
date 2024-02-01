package com.app.imdb.service;

import com.app.imdb.dto.recomDto.RecommendationRequestDto;
import com.app.imdb.dto.recomDto.RecommendationResponseDto;

public interface RecommendationService {
    RecommendationResponseDto recommend(RecommendationRequestDto recommendationRequestDto);
}
