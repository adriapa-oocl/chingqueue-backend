package com.wowowin.chingqueue.unitTest;

import com.wowowin.chingqueue.models.entities.User;
import com.wowowin.chingqueue.repositories.UserRepository;
import com.wowowin.chingqueue.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class usersServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @Test
    void should_add_user_when_call_addUser_api_given_user_details() {
        //given
        User user = new User(1, "Yuto Kuda", "Yuto@yahoo.com", "123456", "123123", "Manila", new Date());

        //when
        User expectedUser = userService.addUser(user);

        //then
        assertEquals(user, expectedUser);

    }
}
