package com.wowowin.chingqueue.mapper;

import com.wowowin.chingqueue.models.entities.User;
import com.wowowin.chingqueue.models.requests.UserRequest;
import com.wowowin.chingqueue.models.responses.UserResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User toEntity(UserRequest userRequest) {
        User user = new User();
        BeanUtils.copyProperties(userRequest, user);
        return user;
    }

    public UserResponse toResponse(User user) {
        UserResponse userResponse = new UserResponse();
        BeanUtils.copyProperties(user, userResponse);

        return userResponse;
    }
}
