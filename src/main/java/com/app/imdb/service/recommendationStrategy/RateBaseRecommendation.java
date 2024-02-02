package com.app.imdb.service.recommendationStrategy;

import com.app.imdb.dto.recomDto.RecommendationRequestDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class RateBaseRecommendation implements RecommendationStrategy{

    private static final Logger log = LoggerFactory.getLogger(GenreBaseRecommendation.class);


    @Override
    public void checkBaseRecommendation(RecommendationRequestDto recommendation) {

    }
}
