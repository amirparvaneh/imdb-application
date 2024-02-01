package com.app.imdb.service.impl;

import com.app.imdb.dto.userDto.UserRequestDto;
import com.app.imdb.dto.userDto.UserRequestDtoDummy;
import com.app.imdb.mapper.UserMapper;
import com.app.imdb.model.User;
import com.app.imdb.repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Spy
    private UserMapper userMapper;

    @Mock
    private UserRepo userRepo;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    void addNewUser_validUserRequest_successfullyAdded() {
        //given
        UserRequestDto userRequestDto = UserRequestDtoDummy.validUserReqDto();
        User user = userMapper.userRequestDtoToUser(userRequestDto);
        //when
        when(userRepo.findUserByUserCode(any())).thenReturn(Optional.empty());
        when(userRepo.save(any(User.class))).thenReturn(user);
        //then
        User actualUser = userService.addNewUser(userRequestDto);
        verify(userRepo,times(1)).save(any(User.class));
        assertEquals(user,actualUser);
    }

    @Test
    void getAllUser_notInput_successReturn() {
    }

    @Test
    void deleteUser_validId_successDelete() {
    }

    @Test
    void checkUserByUserCode_validUserCode_successRetrunUser() {
    }
}