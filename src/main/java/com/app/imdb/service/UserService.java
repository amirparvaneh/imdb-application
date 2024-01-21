package com.app.imdb.service;

import com.app.imdb.dto.userDto.UserRequestDto;
import com.app.imdb.dto.userDto.UserResponse;
import com.app.imdb.model.User;

import java.util.List;

public interface UserService {

    User addNewUser(UserRequestDto userRequestDto);

    List<UserResponse> getAllUser();

    void deleteUser(Long userId);

    boolean checkUserByUserCode(Long userCode);

    User findUserByCode(Long userCode);
}
