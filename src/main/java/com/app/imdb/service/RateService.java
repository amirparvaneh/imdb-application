package com.app.imdb.service;

import com.app.imdb.dto.userDto.UserRateRequestDto;
import com.app.imdb.dto.rateDto.RateResponseDto;

public interface RateService {
    RateResponseDto rateFilm(UserRateRequestDto userRateRequestDto);
}
