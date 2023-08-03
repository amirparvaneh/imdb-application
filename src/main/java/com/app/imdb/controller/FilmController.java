package com.app.imdb.controller;

import com.app.imdb.dto.FilmResponseDto;
import com.app.imdb.model.Film;
import com.app.imdb.service.FilmService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/film")
public class FilmController {

    private final FilmService filmService;

    public FilmController(FilmService filmService){
        this.filmService = filmService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<FilmResponseDto>> getFilmList(){
        List<Film> filmResponseDtos = filmService.findAllFilm();
        prepare
    }
}
