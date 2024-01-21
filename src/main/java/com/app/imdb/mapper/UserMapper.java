package com.app.imdb.mapper;


import com.app.imdb.dto.userDto.UserRequestDto;
import com.app.imdb.dto.userDto.UserResponse;
import com.app.imdb.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userRequestDtoToUser(UserRequestDto userRequestDto);
    List<UserResponse> userToUserResponse(User)
}
