package com.app.imdb.dto.userDto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class UserRequestDto implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
