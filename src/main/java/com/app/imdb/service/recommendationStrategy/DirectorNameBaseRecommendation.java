package com.app.imdb.service.recommendationStrategy;

import com.app.imdb.dto.recomDto.RecommendationRequestDto;
import com.app.imdb.service.impl.RecommendationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DirectorNameBaseRecommendation implements RecommendationStrategy{

    private static final Logger log = LoggerFactory.getLogger(GenreBaseRecommendation.class);
    private final RecommendationServiceImpl recommendationService;


    @Override
    public void checkBaseRecommendation(RecommendationRequestDto recommendation) {

    }
}
