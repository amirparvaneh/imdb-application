package com.app.imdb.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FilmResponseDto {
    private String filmName;
    private Long filmRate;
}
