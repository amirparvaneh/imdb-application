package com.app.imdb.service;

import com.app.imdb.dto.UserRateRequestDto;
import com.app.imdb.dto.rateDto.RateResponseDto;
import com.app.imdb.model.Rate;

public interface RateService {
    RateResponseDto rateFilm(UserRateRequestDto userRateRequestDto);
}
