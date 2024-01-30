package com.app.imdb.dto.userDto;


import static org.junit.jupiter.api.Assertions.*;

public class UserRequestDtoDummy {
    public static UserRequestDto validUserReqDto() {
        return UserRequestDto.builder()
                .firstName("alex")
                .lastName("Jorgensen")
                .email("a.j@gmail.com")
                .phoneNumber("00124354532")
                .build();
    }
}