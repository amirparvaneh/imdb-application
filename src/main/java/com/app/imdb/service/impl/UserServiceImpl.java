package com.app.imdb.service.impl;

import com.app.imdb.dto.UserRequestDto;
import com.app.imdb.exception.UserDomainException;
import com.app.imdb.mapper.UserMapper;
import com.app.imdb.model.User;
import com.app.imdb.repository.UserRepo;
import com.app.imdb.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    public User addNewUser(UserRequestDto userRequestDto) {
        User user = UserMapper.INSTANCE.userRequestDtoToUser(userRequestDto);
        user.setUserCode(createUniqueCode());
        User userAdded = userRepo.save(user);
        return userAdded;
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public void deleteUser(Long userId) {
        User user = userRepo.findById(userId).orElseThrow(
                () -> new UserDomainException(userId)
        );
        userRepo.delete(user);
    }


    private Long createUniqueCode() {
        Long resultCode = 0l;
        do {
            resultCode = new Random().nextLong(9000000) + 1000000;
        } while (!checkUserByUserCode(resultCode));
        return resultCode;
    }

    @Override
    public boolean checkUserByUserCode(Long userCode){
        Optional<User> userByUserCode = userRepo.findUserByUserCode(userCode);
        return userByUserCode.isPresent();
    }
}
