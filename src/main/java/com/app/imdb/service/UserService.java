package com.app.imdb.service;

import com.app.imdb.model.User;
import com.app.imdb.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;


    public List<User> getAllUser(){
        return userRepo.findAll();
    }
}
