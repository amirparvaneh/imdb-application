package com.app.imdb.controller;

import com.app.imdb.ApiVersion;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ApiVersion.VERSION + "/user")
@RequiredArgsConstructor
public class UserController {

}
