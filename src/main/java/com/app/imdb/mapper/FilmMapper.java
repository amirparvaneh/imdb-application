package com.app.imdb.mapper;

import com.app.imdb.dto.FilmResponseDto;
import com.app.imdb.model.Film;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface FilmMapper {
    FilmMapper INSTANCE = Mappers.getMapper(FilmMapper.class);

    FilmResponseDto filmToFilmResponseDto(Film film);
}
