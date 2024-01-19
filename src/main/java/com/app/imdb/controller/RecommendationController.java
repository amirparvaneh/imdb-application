package com.app.imdb.controller;


import com.app.imdb.dto.BaseResponse;
import com.app.imdb.dto.recomDto.GenreRecommendationDto;
import com.app.imdb.dto.recomDto.RecommendationResponseDto;
import com.app.imdb.service.RecommendationService;
import com.app.imdb.service.impl.RecommendationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "recommendations")
@RequiredArgsConstructor
public class RecommendationController {

    private static final Logger log = LoggerFactory.getLogger(RecommendationController.class);
    private final RecommendationServiceImpl recommendationService;

    @PostMapping("/genre")
    public ResponseEntity<BaseResponse> recommendationBasedOnGenre(@RequestBody GenreRecommendationDto genreRecommendationDto) {
        RecommendationResponseDto recommendationResponseDto = recommendationService.RecommendBaseGenre(genreRecommendationDto);
        return ResponseEntity.ok(BaseResponse.builder()
                .message(" new recommendation created ")
                .result(recommendationResponseDto)
                .build());
    }
}
