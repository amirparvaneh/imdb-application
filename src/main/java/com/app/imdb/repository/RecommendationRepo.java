package com.app.imdb.repository;

import com.app.imdb.model.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendationRepo extends JpaRepository<Recommendation,Long> {
}
