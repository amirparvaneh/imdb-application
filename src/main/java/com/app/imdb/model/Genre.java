package com.app.imdb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Genre extends BaseEntity{
    private String name;
    @ManyToMany(mappedBy = "genres")
    private Set<Film> films;
}
