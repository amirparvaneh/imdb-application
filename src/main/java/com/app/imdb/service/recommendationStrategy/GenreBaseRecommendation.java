package com.app.imdb.service.recommendationStrategy;

import com.app.imdb.model.Recommendation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenreBaseRecommendation implements RecommendationStrategy {

    @Override
    public void checkBaseRecommendation(Recommendation recommendation) {

    }
}
