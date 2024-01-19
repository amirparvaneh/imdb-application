package com.app.imdb.mapper;

import com.app.imdb.model.Rate;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RateMapper {
    RateMapper INSTANCE = Mappers.getMapper(RateMapper.class);

}
