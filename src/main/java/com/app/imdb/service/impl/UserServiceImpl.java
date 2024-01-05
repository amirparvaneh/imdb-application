package com.app.imdb.service.impl;

import com.app.imdb.dto.UserRequestDto;
import com.app.imdb.mapper.UserMapper;
import com.app.imdb.model.User;
import com.app.imdb.repository.UserRepo;
import com.app.imdb.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    public User addNewUser(UserRequestDto userRequestDto) {
        User user = UserMapper.INSTANCE.userRequestDtoToUser(userRequestDto);
        User userAdded = userRepo.save(user);
        return userAdded;
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }


}
