package com.app.imdb.service;

import com.app.imdb.dto.FilmRequestDto;
import com.app.imdb.model.Film;
import com.app.imdb.model.Rate;

import java.util.List;

public interface FilmService {
    Film addNewFilm(FilmRequestDto filmRequestDto);
    List<Film> getAllFilm();
    Film findFilm(Long filmId);
    List<Film> searchFilmByTitle(String name);
    void deleteFilmById(Long film);
    Film averageRateForFilm(Rate rate);
    List<Film> filmByName(String name);
}
