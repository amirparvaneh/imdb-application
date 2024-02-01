package com.app.imdb.service.recommendationStrategy;

import com.app.imdb.model.Recommendation;
import org.springframework.stereotype.Service;


@Service
public class RateBaseRecommendation implements RecommendationStrategy{

    @Override
    public void checkBaseRecommendation(Recommendation recommendation) {

    }
}
