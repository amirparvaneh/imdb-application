package com.app.imdb.service.impl;


import com.app.imdb.dto.FilmRequestDto;
import com.app.imdb.exception.ErrorConstants;
import com.app.imdb.exception.FilmDomainException;
import com.app.imdb.mapper.FilmMapper;
import com.app.imdb.model.Film;
import com.app.imdb.model.Rate;
import com.app.imdb.repository.FilmRepo;
import com.app.imdb.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService {

    private static final Logger log = LoggerFactory.getLogger(FilmServiceImpl.class);
    private final FilmRepo filmRepo;


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

    @Override
    public Film findFilm(Long filmId) {
        return filmRepo.findById(filmId).orElseThrow(() ->
                new FilmDomainException("not founded film with this id ", ErrorConstants.NOT_FOUND_FILM_BY_ID,
                        HttpStatus.NOT_FOUND, filmId));
    }

    @Override
    public List<Film> searchFilmByTitle(String name) {
        log.info(" searching in film data with this name : " + name);
        List<Film> filmByTitle = filmRepo.findFilmByTitle(name).orElseThrow(
                () -> new FilmDomainException("no film found with given name ",
                        ErrorConstants.NOT_FOUND_FILM_BY_NAME, HttpStatus.NOT_FOUND)
        );
        return filmByTitle.stream().collect(Collectors.toList());
    }

    @Override
    public void deleteFilmById(Long filmId) {
        Optional<Film> film = Optional.ofNullable(filmRepo.findById(filmId).orElseThrow(
                () -> new FilmDomainException("no film founded", ErrorConstants.NOT_FOUND_FILM_BY_ID,
                        HttpStatus.NOT_FOUND, filmId)
        ));
        filmRepo.delete(film.get());
    }

    @Override
    public List<Film> filmByName(String name) {
        Optional<List<Film>> filmByTitle = filmRepo.findFilmByTitle(name);
        return filmByTitle.get();
    }

    @Override
    public Film averageRateForFilm(Rate rate) {
        Film film = rate.getFilm();
        filmRepo.save(computeAverage(film));
        return film;
    }

    private Film computeAverage(Film film){
        Integer numberOfRates = film.getRate().size();
        double sum = film.getRate().stream().mapToInt(rate -> rate.getScore().getValue()).sum();
        double average = (numberOfRates > 0 ? sum/numberOfRates : 0);
        film.setAverageScore(average);
        return film;
    }
}
