package com.app.imdb.service.impl;


import com.app.imdb.dto.FilmRequestDto;
import com.app.imdb.mapper.FilmMapper;
import com.app.imdb.model.Film;
import com.app.imdb.repository.FilmRepo;
import com.app.imdb.service.FilmService;
import com.app.imdb.service.validation.ValidationService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService {

    private static final Logger log = LoggerFactory.getLogger(FilmServiceImpl.class);
    private final FilmRepo filmRepo;
    private final ValidationService validationService;


    @Override
    public Film addNewFilm(FilmRequestDto filmRequestDto) {
        Film film = FilmMapper.INSTANCE.filmRequestDtoToFilm(filmRequestDto);
        filmRepo.save(film);
        return film;
    }

    @Override
    public List<Film> getAllFilm() {
        return filmRepo.findAll();
    }
}
