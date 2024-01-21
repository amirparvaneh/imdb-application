package com.app.imdb.service;

import com.app.imdb.dto.recomDto.GenreRecommendationDto;
import com.app.imdb.dto.recomDto.RecommendationResponseDto;

public interface RecommendationService {
    RecommendationResponseDto recommendBaseGenre(GenreRecommendationDto genreRecommendationDto);
}
