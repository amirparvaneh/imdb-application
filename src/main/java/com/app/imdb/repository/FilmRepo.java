package com.app.imdb.repository;

import com.app.imdb.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface FilmRepo extends JpaRepository<Film, Long> {

    Optional<List<Film>> findFilmByTitle(String name);
}
