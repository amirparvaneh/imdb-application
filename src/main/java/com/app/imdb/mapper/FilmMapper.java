package com.app.imdb.mapper;

import com.app.imdb.dto.FilmResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public class FilmMapper {

    FilmMapper INSTANCE = Mappers.getMapper(FilmMapper.class);


}
