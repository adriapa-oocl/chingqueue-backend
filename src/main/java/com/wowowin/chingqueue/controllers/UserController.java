package com.wowowin.chingqueue.controllers;


import com.wowowin.chingqueue.mapper.UserMapper;
import com.wowowin.chingqueue.models.requests.UserRequest;
import com.wowowin.chingqueue.models.responses.UserResponse;
import com.wowowin.chingqueue.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public UserResponse addUser(@RequestBody UserRequest userRequest) {
        return userMapper.toResponse(userService.addUser(userMapper.toEntity(userRequest)));
    }

    @PostMapping("/login")
    public UserResponse getLogInDetails(@RequestBody UserRequest userRequest) {
        return userMapper.toResponse(userService.getLogIn(userMapper.toEntity(userRequest)));
    }

    @GetMapping
    public List<UserResponse> getAllUsers() {
        return userMapper.toResponseList(userService.getAllUsers());
    }


}
