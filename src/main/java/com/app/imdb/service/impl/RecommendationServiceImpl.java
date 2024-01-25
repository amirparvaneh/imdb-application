package com.app.imdb.service.impl;

import com.app.imdb.dto.recomDto.RecommendationRequestDto;
import com.app.imdb.dto.recomDto.RecommendationResponseDto;
import com.app.imdb.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecommendationServiceImpl implements RecommendationService {

    @Override
    public RecommendationResponseDto recommendBaseGenre(RecommendationRequestDto recommendationRequestDto) {
        return null;
    }

    @Override
    public RecommendationResponseDto recommendBaseDirector(RecommendationRequestDto recommendationRequestDto) {
        return null;
    }

    @Override
    public RecommendationResponseDto recommendBaseRating(RecommendationRequestDto recommendationRequestDto) {
        return null;
    }


}
