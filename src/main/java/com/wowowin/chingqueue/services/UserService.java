package com.wowowin.chingqueue.services;

import com.wowowin.chingqueue.Exceptions.UserNotFound;
import com.wowowin.chingqueue.models.entities.User;
import com.wowowin.chingqueue.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        userRepository.save(user);
        return user;
    }

    public User getLogIn(User user) {

        return userRepository.findByUsername(user.getUsername())
                    .stream()
                    .filter(user1 -> user1.getPassword().equals(user.getPassword()))
                    .findFirst().orElseThrow(()-> new UserNotFound("Username/Password invalid."));
    }
}
