package com.app.imdb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Recommendation extends BaseEntity{

    private String filmTitle;
    private Integer averageScore;
    @ManyToOne
    @JoinColumn("user_id")
    private User user;
    @OneToOne
    private Film film;
    @Enumerated(EnumType.STRING)
    private RecommendationBase recommendationBase;
    private LocalDateTime time;

}
