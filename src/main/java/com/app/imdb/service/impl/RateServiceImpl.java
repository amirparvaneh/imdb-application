package com.app.imdb.service.impl;

import com.app.imdb.dto.UserRateRequestDto;
import com.app.imdb.dto.rateDto.RateResponseDto;
import com.app.imdb.model.Rate;
import com.app.imdb.repository.RateRepository;
import com.app.imdb.service.RateService;
import com.app.imdb.service.validation.ValidationService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RateServiceImpl implements RateService {

    private static final Logger log = LoggerFactory.getLogger(RateServiceImpl.class);
    private final RateRepository rateRepository;
    private final ValidationService validationService;


    @Override
    public RateResponseDto rateFilm(UserRateRequestDto userRateRequestDto) {
        validationService.validateRequestRate(userRateRequestDto);
        return null;
    }
}
