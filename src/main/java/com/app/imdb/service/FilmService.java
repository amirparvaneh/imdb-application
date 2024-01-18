package com.app.imdb.service;

import com.app.imdb.dto.FilmRequestDto;
import com.app.imdb.model.Film;

import java.util.List;

public interface FilmService {
    Film addNewFilm(FilmRequestDto filmRequestDto);
    List<Film> getAllFilm();
    Film findFilm(Long filmId);
    List<Film> searchFilmByTitle(String name);
    void deleteFilmById(Long film);
}
