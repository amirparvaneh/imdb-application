package com.app.imdb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Film extends BaseEntity{
    private String title;
    @ManyToOne
    @JoinColumn(name = "director_id")
    private Director director;
    private Double averageScore;
    @OneToMany(mappedBy = "film")
    private Set<Rate> rate;
    @ManyToMany
    @JoinTable(name = "film-genre",
    joinColumns = @JoinColumn(name = "film-id"),
    inverseJoinColumns = @JoinColumn(name = "genre-id"))
    private Set<Genre> genres;
    private LocalDateTime productionDate;
}
