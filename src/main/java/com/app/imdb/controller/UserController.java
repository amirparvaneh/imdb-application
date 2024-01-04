package com.app.imdb.controller;

import com.app.imdb.ApiVersion;
import com.app.imdb.dto.BaseResponse;
import com.app.imdb.dto.UserRequestDto;
import com.app.imdb.model.User;
import com.app.imdb.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ApiVersion.VERSION + "/users")
@RequiredArgsConstructor
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    private final UserServiceImpl userService;


    @PostMapping
    public ResponseEntity<BaseResponse<User>> addNewUser(@RequestBody UserRequestDto userRequestDto){
        userService.addNewUser(userRequestDto);
    }
}
