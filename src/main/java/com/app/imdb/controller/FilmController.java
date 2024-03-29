package com.app.imdb.controller;

import com.app.imdb.ApiVersion;
import com.app.imdb.dto.BaseResponse;
import com.app.imdb.dto.FilmRequestDto;
import com.app.imdb.dto.userDto.UserRateRequestDto;
import com.app.imdb.dto.rateDto.RateResponseDto;
import com.app.imdb.model.Film;
import com.app.imdb.service.impl.FilmServiceImpl;
import com.app.imdb.service.impl.RateServiceImpl;
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
    private final RateServiceImpl rateService;


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

    @PostMapping(value = "/rate")
    public ResponseEntity<BaseResponse> rateFilm(@RequestBody UserRateRequestDto userRateRequestDto) {
        RateResponseDto rate = rateService.rateFilm(userRateRequestDto);
        return ResponseEntity.ok(BaseResponse.builder()
                .message("request have been done.")
                .result(rate)
                .build());
    }

    @GetMapping(value = "/search")
    public ResponseEntity<BaseResponse> searchFilmByTitle(@RequestParam String name) {
        List<Film> films = filmServiceImpl.searchFilmByTitle(name);
        return ResponseEntity.ok(BaseResponse.builder()
                .message(" films return with name " + name)
                .result(films)
                .build());
    }

    @DeleteMapping(value = "/{filmId}")
    private ResponseEntity<BaseResponse> deleteFilmById(@PathVariable(value = "filmId") Long filmId) {
        filmServiceImpl.deleteFilmById(filmId);
        return ResponseEntity.ok(BaseResponse.builder()
                .message("film with this id " + filmId + " have been deleted succesfully")
                .result(null)
                .build());
    }

    @GetMapping(value = "/{name}")
    private ResponseEntity<BaseResponse> getFilmByName(@PathVariable(value = "name") String name){
        List<Film> films = filmServiceImpl.filmByName(name);
        return ResponseEntity.ok(BaseResponse.builder()
        .message("result for film with name : " + name)
        .result(films)
        .build());
    }
}
