package com.wowowin.chingqueue.integrationTest;

import com.wowowin.chingqueue.models.entities.Review;
import com.wowowin.chingqueue.repositories.ReviewRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ReviewIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private ReviewRepository reviewRepository;

    @BeforeEach
    void tearDown() {
        reviewRepository.deleteAll();
    }

    @Test
    void should_return_list_of_movies_when_get_all_movies_given_get_request() throws Exception {
        //given
        Review review = new Review(1, "5", 5, "test", new Date());
        reviewRepository.save(review);

        //when
        //then
        mockMvc.perform(get("/reviews"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].reviewId").value(1))
                .andExpect(jsonPath("$[0].rating").value(5));
    }

    @Test
    void should_create_employee_when_create_given_employee_request() throws Exception {
        // given
        String movieJson = "{\n" +
                "  \"reviewId\": 22,\n" +
                "  \"rating\": \"5\",\n" +
                "  \"userId\": 22,\n" +
                "  \"reviewContent\": \"urlimage\"\n" +
                "}";

        // when
        // then
        mockMvc.perform(post("/reviews")
                .contentType(MediaType.APPLICATION_JSON)
                .content(movieJson))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.rating").value("5"))
                .andExpect(jsonPath("$.reviewContent").value("urlimage"));

    }

    @Test
    void should_delete_movie_when_delete_request_given_delete_movie_request() throws Exception {
        //given
        Review review = new Review(1, "5", 5, "test", new Date());
        reviewRepository.save(review);

        //when
        //then
        mockMvc.perform(delete("/reviews/" + review.getReviewId()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].reviewId").doesNotExist())
                .andExpect(jsonPath("$[0].rating").doesNotExist());
    }

}
