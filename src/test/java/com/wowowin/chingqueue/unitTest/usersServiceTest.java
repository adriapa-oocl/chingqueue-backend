package com.wowowin.chingqueue.unitTest;

import com.wowowin.chingqueue.models.entities.User;
import com.wowowin.chingqueue.repositories.UserRepository;
import com.wowowin.chingqueue.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.Date;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

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

    @Test
    void should_login_when_call_login_api_given_user_details() {

        User user = new User(1, "Yuto Kuda", "Yuto@yahoo.com", "123456", "123123", "Manila", new Date());

        //when
        when(userRepository.findByUsername("Yuto@yahoo.com")).thenReturn(Collections.singletonList(user));
        //then

        User actual = userService.getLogIn(user);

        assertEquals(asList(user.getPassword()), asList(actual.getPassword()));

    }

    @Test
    void should_return_invalid_when_call_login_api_given_invalid_details() {

        User user = new User(1, "Yuto Kuda", "Yuto@yahoo.com", "123456", "123123", "Manila", new Date());
        User user2 = new User(1, "Yuto Kuda", "Yuto@yahoo.com", "654321", "123123", "Manila", new Date());

        //when
        when(userRepository.findByUsername("Yuto@yahoo.com")).thenReturn(Collections.singletonList(user));
        //then
        //Then
        Throwable runtimeException = assertThrows(RuntimeException.class
                , () -> userService.getLogIn(user2));
        assertEquals("Username/Password invalid.", runtimeException.getMessage());

    }
}
