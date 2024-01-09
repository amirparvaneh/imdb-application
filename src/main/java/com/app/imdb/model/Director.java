package com.app.imdb.model;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Director extends BaseEntity{
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "director",fetch = FetchType.EAGER)
    private Set<Film> film;
}
