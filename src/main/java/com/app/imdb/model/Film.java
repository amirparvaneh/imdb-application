package com.app.imdb.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "film")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    @Id
    private String id ;
    private String filmName;
    @Min(value = 1 , message = "minimum range is 1")
    @Max(value = 5 , message = "maximum range is 5")
    private Long rate;
}
