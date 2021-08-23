package com.wowowin.chingqueue.controllers;


import com.wowowin.chingqueue.mapper.UserMapper;
import com.wowowin.chingqueue.models.requests.UserRequest;
import com.wowowin.chingqueue.models.responses.UserResponse;
import com.wowowin.chingqueue.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {


    private UserService userService;

    private UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping("/register")
    @ResponseStatus(code = HttpStatus.CREATED)
    public UserResponse addUser(@RequestBody UserRequest userRequest) {
        return userMapper.toResponse(userService.addUser(userMapper.toEntity(userRequest)));
    }
}
