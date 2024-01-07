package com.app.imdb.service.validation;

import com.app.imdb.model.Genre;

public class ValidationService {
    private final EnumValidation<Genre> genreEnumValidation = new EnumValidation<>(Genre.class);

    public Genre checkGenre(String inputGenre){
        if (genreEnumValidation.isValidType(inputGenre)){

        }
    }
}
