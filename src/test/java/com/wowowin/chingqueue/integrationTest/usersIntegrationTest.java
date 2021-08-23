package com.wowowin.chingqueue.integrationTest;

import com.wowowin.chingqueue.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class usersIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
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

}
