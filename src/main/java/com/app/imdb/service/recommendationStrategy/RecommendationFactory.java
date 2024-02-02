package com.app.imdb.service.recommendationStrategy;


import com.app.imdb.dto.recomDto.RecommendationRequestDto;
import com.app.imdb.exception.ErrorConstants;
import com.app.imdb.exception.RecommendationDomainException;
import com.app.imdb.model.Rate;
import com.app.imdb.model.Recommendation;
import com.app.imdb.model.RecommendationBase;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class RecommendationFactory {

    private Map<RecommendationBase, RecommendationStrategy> validators;

    public RecommendationFactory(GenreBaseRecommendation genreBaseRecommendation,
                                 RateBaseRecommendation rateBaseRecommendation,
                                 DirectorNameBaseRecommendation directorNameBaseRecommendation) {
        this.validators = initializeValidators(genreBaseRecommendation, rateBaseRecommendation, directorNameBaseRecommendation);
    }

    private Map<RecommendationBase, RecommendationStrategy> initializeValidators(
            GenreBaseRecommendation genreBaseRecommendation,
            RateBaseRecommendation rateBaseRecommendation,
            DirectorNameBaseRecommendation directorNameBaseRecommendation) {
        Map<RecommendationBase, RecommendationStrategy> strategyMap = new HashMap<>();
        strategyMap.put(RecommendationBase.GENRE, genreBaseRecommendation);
        strategyMap.put(RecommendationBase.RATINGS, rateBaseRecommendation);
        strategyMap.put(RecommendationBase.DIRECTOR, directorNameBaseRecommendation);
        return strategyMap;
    }

    public void recommendationProcess(RecommendationBase recommendationBase, RecommendationRequestDto recommendation){
        RecommendationStrategy strategy = validators.get(recommendationBase);
        if (Objects.nonNull(strategy)){
            strategy.checkBaseRecommendation(recommendation);
        }else {
            throw new RecommendationDomainException("not valid recommendation type",
                    ErrorConstants.NOT_VALID_ENUM, HttpStatus.BAD_REQUEST);
        }
    }
}
