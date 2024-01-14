package com.app.imdb.service.impl;

import com.app.imdb.dto.UserRequestDto;
import com.app.imdb.exception.ErrorConstants;
import com.app.imdb.exception.RateDomainException;
import com.app.imdb.exception.UserDomainException;
import com.app.imdb.mapper.UserMapper;
import com.app.imdb.model.User;
import com.app.imdb.repository.UserRepo;
import com.app.imdb.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
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
        return userRepo.save(user);
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
    public boolean checkUserByUserCode(Long userCode) {
        Optional<User> userByUserCode = userRepo.findUserByUserCode(userCode);
        return userByUserCode.isPresent();
    }

    @Override
    public User findUserByCode(Long userCode) {
        return userRepo.findUserByUserCode(userCode).orElseThrow(() ->
                new RateDomainException("user not found", ErrorConstants.NOT_FOUND_USER_BY_CODE, HttpStatus.NOT_FOUND,
                        userCode));
    }
}
