package com.wowowin.chingqueue.integrationTest;

import com.wowowin.chingqueue.models.entities.Movie;
import com.wowowin.chingqueue.repositories.MovieRepository;
import com.wowowin.chingqueue.repositories.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class MovieIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    @Mock
    private MovieRepository movieRepository;

    @BeforeEach
    void tearDown() {
        movieRepository.deleteAll();
    }

    @Test
    void should_return_list_of_movies_when_get_all_movies_given_get_request() throws Exception {
        //given
        Movie movie = new Movie(1, "kmovie", "test");
        movieRepository.save(movie);

        //when
        //then
        mockMvc.perform(get("/movies"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].movie_name").value("kmovie"))
                .andExpect(jsonPath("$[0].movie_img").value("test"));
    }

    @Test
    void should_create_employee_when_create_given_employee_request() throws Exception {
        // given
        String movieJson = "{\n" +
                "  \"id\": 22,\n" +
                "  \"movie_name\": \"kmovie\",\n" +
                "  \"movie_img\": \"urlimage\"\n" +
                "}";

        // when
        // then
        mockMvc.perform(post("/movies")
                .contentType(MediaType.APPLICATION_JSON)
                .content(movieJson))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.movie_name").value("kmovie"))
                .andExpect(jsonPath("$.movie_img").value("urlimage"));

        List<Movie> movies = movieRepository.findAll();
        Assertions.assertEquals(1, movies.size());
    }
}
