package com.app.imdb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FilmRequestDto implements Serializable {
    private String name;
    private String genreName;
    private String country;
    private String director;
}
