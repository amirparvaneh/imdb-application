package com.app.imdb.model;

import jakarta.persistence.Entity;

@Entity
public class Rate extends BaseEntity{
    private Long score;
    private User user;
    private Film film;
}
