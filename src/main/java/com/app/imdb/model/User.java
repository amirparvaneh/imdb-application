package com.app.imdb.model;


import jakarta.persistence.Entity;

@Entity
public class User extends BaseEntity{

    private String firstName;
    private String lastName;

}
