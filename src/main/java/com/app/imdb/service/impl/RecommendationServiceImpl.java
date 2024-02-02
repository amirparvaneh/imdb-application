package com.app.imdb.service.impl;

import com.app.imdb.dto.recomDto.RecommendationRequestDto;
import com.app.imdb.dto.recomDto.RecommendationResponseDto;
import com.app.imdb.model.Film;
import com.app.imdb.model.Recommendation;
import com.app.imdb.model.RecommendationBase;
import com.app.imdb.model.User;
import com.app.imdb.service.RecommendationService;
import com.app.imdb.service.recommendationStrategy.RecommendationFactory;
import com.app.imdb.service.validation.ValidationService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecommendationServiceImpl implements RecommendationService {

    private static final Logger log = LoggerFactory.getLogger(RecommendationServiceImpl.class);

    private final ValidationService validationService;

    private final RecommendationFactory recommendationFactory;

    @Override
    public RecommendationResponseDto recommend(RecommendationRequestDto recommendationRequestDto) {
        RecommendationBase recommendationBase =
                validationService.getRecommendationBase(recommendationRequestDto.getRecommendationBase());
        validationService.validateUser(recommendationRequestDto.getUserCode());
        validationService.validateFilmTitle(recommendationRequestDto.getFilmTitle());
        recommendationFactory.recommendationProcess(recommendationBase,recommendationRequestDto);
    }


}
