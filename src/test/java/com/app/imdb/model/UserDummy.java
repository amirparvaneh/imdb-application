package com.app.imdb.model;

import static org.junit.jupiter.api.Assertions.*;

public class UserDummy {
    public static User validUserBuilder() {
        return User.builder()
                .firstName("alex")
                .lastName("Jorgensen")
                .email("a.j@gmail.com")
                .phoneNumber("00124354532")
                .build();
    }

}