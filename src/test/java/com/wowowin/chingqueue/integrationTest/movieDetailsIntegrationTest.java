package com.wowowin.chingqueue.integrationTest;

import com.wowowin.chingqueue.models.entities.MovieDetails;
import com.wowowin.chingqueue.repositories.MovieDetailsRepository;
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
public class movieDetailsIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    @Mock
    private MovieDetailsRepository movieDetailsRepository;

    @BeforeEach
    void tearDown() {
        movieDetailsRepository.deleteAll();
    }

    @Test
    void should_add_movieDetails_when_call_addMovieDetails_api() throws Exception {
        //given
        String movieDetails = "{\n" +
                "        \"movieId\": \"1\",\n" +
                "        \"movieDescription\": \"Mine\",\n" +
                "        \"movieGenre\" : \"Romance\"\n" +
                "}";

        //when

        //then
        mockMvc.perform(MockMvcRequestBuilders.post("/moviedetails")
                .contentType(MediaType.APPLICATION_JSON)
                .content(movieDetails))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.movieId").value(1))
                .andExpect(jsonPath("$.movieDescription").value("Mine"))
                .andExpect(jsonPath("$.movieGenre").value("Romance"));
    }

    @Test
    void should_return_all_movieDetails_when_call_getAllMovieDetails_api() throws Exception {
        //given
        final MovieDetails movieDetails = new MovieDetails(1, "Pew pew", "Action");
        movieDetailsRepository.save(movieDetails);

        //when

        //then
        mockMvc.perform(MockMvcRequestBuilders.get("/moviedetails"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].movieId").value(1))
                .andExpect(jsonPath("$[0].movieDescription").value("Pew pew"))
                .andExpect(jsonPath("$[0].movieGenre").value("Action"));
    }

    @Test
    void should_return_correct_movieDetails_when_call_getMovieDetailsByMovieId_api() throws Exception {
        //given
        final MovieDetails firstMovieDetails = new MovieDetails(1, "Pew pew", "Action");
        movieDetailsRepository.save(firstMovieDetails);

        final MovieDetails secondMovieDetails = new MovieDetails(2, "Cool Acting", "Gore");
        movieDetailsRepository.save(secondMovieDetails);

        //when

        //then
        int movieId = secondMovieDetails.getMovieId();

        mockMvc.perform(MockMvcRequestBuilders.get("/moviedetails/{movieId}", movieId))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.movieId").value(2))
                .andExpect(jsonPath("$.movieDescription").value("Cool Acting"))
                .andExpect(jsonPath("$.movieGenre").value("Gore"));
    }

    @Test
    void should_update_movieDetails_when_call_updateMovieDetails_api() throws Exception {

        final MovieDetails firstMovieDetails = new MovieDetails(1, "Pew pew", "Action");
        movieDetailsRepository.save(firstMovieDetails);

        String movieDetails = "{\n" +
                "        \"movieId\": \"1\",\n" +
                "        \"movieDescription\": \"Mine\",\n" +
                "        \"movieGenre\" : \"Romance\"\n" +
                "}";

        Integer movieId = firstMovieDetails.getMovieId();

        mockMvc.perform(MockMvcRequestBuilders.put("/moviedetails/{movieId}", movieId)
                .contentType(MediaType.APPLICATION_JSON)
                .content(movieDetails))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.movieId").value(1))
                .andExpect(jsonPath("$.movieDescription").value("Mine"))
                .andExpect(jsonPath("$.movieGenre").value("Romance"));
    }

    @Test
    void should_delete_movieDetails_when_call_deleteMovieDetails_api() throws Exception {
        final MovieDetails firstMovieDetails = new MovieDetails(1, "Pew pew", "Action");
        movieDetailsRepository.save(firstMovieDetails);

        Integer movieId = firstMovieDetails.getMovieDetailsId();

        mockMvc.perform(MockMvcRequestBuilders.delete("/moviedetails/{movieDetailsId}", movieId))
                .andExpect(status().isOk());


    }

}
