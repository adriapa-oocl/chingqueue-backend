package com.wowowin.chingqueue.integrationTest;

import com.wowowin.chingqueue.repositories.MovieReviewsRepository;
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

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class moviesReviewsIntegrationTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    @Mock
//    private MovieReviewsRepository movieReviewsRepository;
//
//    @BeforeEach
//    void tearDown() {
//        movieReviewsRepository.deleteAll();
//    }
//
//    @Test
//    void should_add_movieReview_when_call_addMovieReview_api() throws Exception {
//        //given
//
//        String movieReview = "\n" +
//                "    {\n" +
//                "        \"reviewId\": 1,\n" +
//                "        \"movie_details_id\": 1,\n" +
//                "        \"user_id\": 1,\n" +
//                "        \"create_dt\": \"2021-08-23T16:00:00.000+00:00\",\n" +
//                "        \"review_content\": \"Amazing film!\"\n" +
//                "    }";
//
//        //when
//        //then
//        mockMvc.perform(MockMvcRequestBuilders.post("/movie-reviews")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(movieReview))
//                .andExpect(status().isCreated())
//                .andExpect(jsonPath("$.reviewId").value(1))
//                .andExpect(jsonPath("$.movie_details_id").value(1))
//                .andExpect(jsonPath("$.user_id").value(1))
//                .andExpect(jsonPath("$.review_content").value("Amazing film!"));
//
//
//    }

}
