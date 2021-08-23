package com.wowowin.chingqueue.integrationTest;

import com.wowowin.chingqueue.exception.UserNotFound;
import com.wowowin.chingqueue.models.entities.User;
import com.wowowin.chingqueue.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class usersIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    @Mock
    private UserRepository userRepository;

   @BeforeEach
    void tearDown() {
        userRepository.deleteAll();
    }


    @Test
    void should_add_user_when_call_addUser_api() throws Exception {
        //given
        String user = "{ \n" +
                "\"full_name\": \"Yuto Kuda\",\n" +
                "\"username\": \"yuto124\",\n" +
                "\"password\":\"password123\",\n" +
                "\"contact_num\" : \"1122334455\",\n" +
                "\"address\" : \"manila\"\n" +
                "}\n";

        //when

        //then
        mockMvc.perform(MockMvcRequestBuilders.post("/users")
        .contentType(MediaType.APPLICATION_JSON)
        .content(user))
        .andExpect(status().isCreated())
        .andExpect(jsonPath("$.full_name").value("Yuto Kuda"))
        .andExpect(jsonPath("$.username").value("yuto124"))
        .andExpect(jsonPath("$.password").value("password123"))
        .andExpect(jsonPath("$.contact_num").value("1122334455"))
        .andExpect(jsonPath("$.address").value("manila"));
    }

    @Test
    void should_return_employee_when_get_specific_employee_given_get_employee_request() throws Exception {
        //given
        User user = userRepository.save(new User(1, "YutoKuda", "yuto124",
                "123456", "123123", "Manila", new Date()));

        String saveUser = user.getPassword();

        String loginUser = "{ \n" +
                "\"full_name\": \"YutoKuda\",\n" +
                "\"username\": \"yuto124\",\n" +
                "\"password\":\"123456\",\n" +
                "\"contact_num\" : \"1122334455\",\n" +
                "\"address\" : \"manila\"\n" +
                "}\n";

       User users = userRepository.findByUsername("yuto124").stream()
                .filter(user1 -> user1.getPassword().equals(user.getPassword()))
                .findFirst().orElseThrow(()-> new UserNotFound("Username/Password invalid."));

       mockMvc.perform(MockMvcRequestBuilders.get("/users")
               .contentType(MediaType.APPLICATION_JSON)
               .content(loginUser))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.username").value(users.getUsername()))
               .andExpect(jsonPath("$.password").value(users.getPassword()));
    }

}
