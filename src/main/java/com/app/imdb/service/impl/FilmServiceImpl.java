package com.app.imdb.service.impl;


import com.app.imdb.dto.FilmRequestDto;
import com.app.imdb.dto.FilmResponseDto;
import com.app.imdb.model.Film;
import com.app.imdb.repository.FilmRepo;
import com.app.imdb.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService {

    private static final Logger log = LoggerFactory.getLogger(FilmServiceImpl.class);
    private final FilmRepo filmRepo;

    @Override
    public Film addNewFilm(FilmRequestDto filmRequestDto) {
        return null;
    }
}
