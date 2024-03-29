package com.app.imdb.controller;


import com.app.imdb.dto.BaseResponse;
import com.app.imdb.dto.recomDto.RecommendationRequestDto;
import com.app.imdb.dto.recomDto.RecommendationResponseDto;
import com.app.imdb.service.impl.RecommendationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "recommendations")
@RequiredArgsConstructor
public class RecommendationController {

    private static final Logger log = LoggerFactory.getLogger(RecommendationController.class);
    private final RecommendationServiceImpl recommendationService;

    @PostMapping("/recommendBase")
    public ResponseEntity<BaseResponse> recommendationBasedOnGenre(@RequestBody RecommendationRequestDto recommendationRequestDto) {
        RecommendationResponseDto recommendationResponseDto = recommendationService.recommend(recommendationRequestDto);
        return ResponseEntity.ok(BaseResponse.builder()
                .message(" new recommendation created ")
                .result(recommendationResponseDto)
                .build());
    }

}
