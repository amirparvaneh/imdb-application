package com.app.imdb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private Integer averageScore;
    @OneToMany(mappedBy = "film")
    private Set<Rate> rate;
    @Enumerated(EnumType.STRING)
    private Genre genre;
}
