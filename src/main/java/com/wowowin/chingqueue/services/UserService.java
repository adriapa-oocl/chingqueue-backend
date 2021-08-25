package com.wowowin.chingqueue.services;

import com.wowowin.chingqueue.exception.UserAlreadyExistsException;
import com.wowowin.chingqueue.exception.UserNotFound;
import com.wowowin.chingqueue.models.entities.User;
import com.wowowin.chingqueue.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {

        List<User> currentUser = userRepository.findByUsername(user.getUsername());

        if (!currentUser.isEmpty()) {
            throw new UserAlreadyExistsException("Username already exists");
        }

        return userRepository.save(user);
    }

    public User getLogIn(User user) {

        return userRepository.findByUsername(user.getUsername())
                    .stream()
                    .filter(user1 -> user1.getPassword().equals(user.getPassword()))
                    .findFirst().orElseThrow(()-> new UserNotFound("Username/Password invalid."));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
