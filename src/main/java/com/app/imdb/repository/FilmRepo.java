package com.app.imdb.repository;

import com.app.imdb.model.Film;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FilmRepo extends MongoRepository<Film,String> {
}
