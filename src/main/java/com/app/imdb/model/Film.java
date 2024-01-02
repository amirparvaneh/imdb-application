package com.app.imdb.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
    private String filmName;
    @Min(value = 1, message = "minimum range is 1")
    @Max(value = 5, message = "maximum range is 5")
    private Long rate;
}
