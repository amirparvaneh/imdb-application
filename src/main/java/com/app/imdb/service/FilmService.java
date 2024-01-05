package com.app.imdb.service;

import com.app.imdb.dto.FilmRequestDto;
import com.app.imdb.model.Film;

public interface FilmService {
    Film addNewFilm(FilmRequestDto filmRequestDto);
}
