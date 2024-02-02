package com.app.imdb.service.recommendationStrategy;

import com.app.imdb.dto.recomDto.RecommendationRequestDto;
import com.app.imdb.model.Recommendation;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenreBaseRecommendation implements RecommendationStrategy {

    private static final Logger log = LoggerFactory.getLogger(GenreBaseRecommendation.class);

    @Override
    public void checkBaseRecommendation(RecommendationRequestDto recommendation) {

    }
}
