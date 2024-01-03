package com.app.imdb.service;


import com.app.imdb.dto.FilmResponseDto;
import com.app.imdb.model.Film;
import com.app.imdb.repository.FilmRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmService {

    private final FilmRepo filmRepo;



    public List<FilmResponseDto> findAllFilm() {
        List<Film> films = filmRepo.findAll();

        return ;
    }


    private List<FilmResponseDto> prepareFilmList(List<Film> films) {
        List<FilmResponseDto> filmResponseDtos = new ArrayList<>();
        films.stream().map(film -> FilmResponseDto.builder()
                .)
    }
}
