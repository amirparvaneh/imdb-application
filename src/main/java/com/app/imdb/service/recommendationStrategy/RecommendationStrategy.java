package com.app.imdb.service.recommendationStrategy;

import com.app.imdb.model.Recommendation;

public interface RecommendationStrategy {
    void checkBaseRecommendation(Recommendation recommendation);
}
