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
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiVersion.VERSION + "/users")
@RequiredArgsConstructor
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    private final UserServiceImpl userService;


    @PostMapping
    public ResponseEntity<BaseResponse<User>> addNewUser(@RequestBody UserRequestDto userRequestDto) {
        User user = userService.addNewUser(userRequestDto);
        return ResponseEntity.ok(BaseResponse.<User>builder()
                .message("added")
                .result(user)
                .build());
    }

    @DeleteMapping(value = "/{userId}")
    public ResponseEntity<BaseResponse> deleteUser(@PathVariable(value = "userId") Long userId){
        userService.deleteUser(userId);
        return ResponseEntity.ok(BaseResponse.builder()
                .message("deleted")
                .result(null)
                .build());
    }

    @GetMapping(value = "/all")
    public ResponseEntity<BaseResponse> getAllUser(){
        List<User> allUser = userService.getAllUser();
        return ResponseEntity.ok(BaseResponse.builder()
                .message("size of user" + allUser.size())
                .result(allUser).build());
    }

}
