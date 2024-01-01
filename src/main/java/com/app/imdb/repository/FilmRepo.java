package com.app.imdb.repository;

import com.app.imdb.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FilmRepo extends JpaRepository<Film, Long> {
}
