package com.app.imdb.controller;

import com.app.imdb.ApiVersion;
import com.app.imdb.dto.BaseResponse;
import com.app.imdb.dto.FilmRequestDto;
import com.app.imdb.dto.UserRateRequestDto;
import com.app.imdb.model.Film;
import com.app.imdb.service.impl.FilmServiceImpl;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = ApiVersion.VERSION + "/films")
@RequiredArgsConstructor
public class FilmController {

    private static final Logger log = LoggerFactory.getLogger(FilmController.class);
    private final FilmServiceImpl filmServiceImpl;


    @PostMapping
    public ResponseEntity<BaseResponse<Film>> addNewFilm(@RequestBody FilmRequestDto filmRequestDto) {
        Film film = filmServiceImpl.addNewFilm(filmRequestDto);
        return ResponseEntity.ok(BaseResponse.<Film>builder()
                .message("added")
                .result(film)
                .build());
    }


    @GetMapping(value = "/all")
    public ResponseEntity<BaseResponse> getAllFilm() {
        List<Film> allFilm = filmServiceImpl.getAllFilm();
        return ResponseEntity.ok(BaseResponse.builder()
                .message("number of return films is :  " + allFilm.size())
                .result(allFilm)
                .build());
    }

    @PostMapping
    public ResponseEntity<BaseResponse> rateFilm(@RequestBody UserRateRequestDto)
}
