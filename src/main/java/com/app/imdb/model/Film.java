package com.app.imdb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


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
}
