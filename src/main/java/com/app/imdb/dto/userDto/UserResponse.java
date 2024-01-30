package com.app.imdb.dto.userDto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {
    private String firstName;
    private String lastName;
    private Long userCode;
}
