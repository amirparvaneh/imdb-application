package com.app.imdb.service.impl;

import com.app.imdb.dto.recomDto.GenreRecommendationDto;
import com.app.imdb.dto.recomDto.RecommendationResponseDto;
import com.app.imdb.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecommendationServiceImpl implements RecommendationService {

    @Override
    public RecommendationResponseDto RecommendBaseGenre(GenreRecommendationDto genreRecommendationDto) {
        return null;
    }
}
