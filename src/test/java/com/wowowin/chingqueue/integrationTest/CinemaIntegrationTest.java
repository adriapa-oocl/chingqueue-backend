package com.wowowin.chingqueue.integrationTest;

import com.wowowin.chingqueue.models.entities.Cinema;
import com.wowowin.chingqueue.repositories.CinemaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CinemaIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private CinemaRepository cinemaRepository;

    @BeforeEach
    void tearDown() {
        cinemaRepository.deleteAll();
    }

    @Test
    void should_return_list_of_cinemas_when_call_getAllCinemas() throws Exception {
        //given
        Cinema cinema = new Cinema("SM", "Calamba", 7, "12:00;13:00;14:00");
        cinemaRepository.save(cinema);

        //when
        //then
        mockMvc.perform(get("/cinemas"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].cinemaCompany").value("SM"))
                .andExpect(jsonPath("$[0].cinemaLocation").value("Calamba"))
                .andExpect(jsonPath("$[0].movieId").value(7))
                .andExpect(jsonPath("$[0].cinemaTimeslotList[0]").value("12:00"));
    }

    @Test
    void should_add_cinemas_when_call_addCinema() throws Exception {
        //given
        String cinema = "{\n" +
                "        \"cinemaCompany\": \"SM\",\n" +
                "        \"cinemaLocation\": \"Calamba\",\n" +
                "        \"movieId\" : \"7\",\n" +
                "        \"cinemaTimeslot\" : \"12:00;13:00;14:00\"\n" +
                "}";

        //when

        //then
        mockMvc.perform(MockMvcRequestBuilders.post("/cinemas")
                .contentType(MediaType.APPLICATION_JSON)
                .content(cinema))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.cinemaCompany").value("SM"))
                .andExpect(jsonPath("$.cinemaLocation").value("Calamba"))
                .andExpect(jsonPath("$.movieId").value(7))
                .andExpect(jsonPath("$.cinemaTimeslotList[0]").value("12:00"));
    }

    @Test
    void should_return_correct_list_of_cinemas_when_call_getCinemaByMovieId() throws Exception {
        //given
        Cinema firstCinema = new Cinema("SM", "Calamba", 7, "12:00;13:00;14:00");
        cinemaRepository.save(firstCinema);

        Cinema secondCinema = new Cinema("Robinsons", "Manila", 6, "12:00;13:00;14:00");
        cinemaRepository.save(secondCinema);

        Cinema thirdCinema = new Cinema("Ayala", "Ortigas", 7, "12:00;13:00;14:00");
        cinemaRepository.save(thirdCinema);

        //when
        //then
        mockMvc.perform(get("/cinemas/{movie_id}", 7))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].cinemaCompany").value("SM"))
                .andExpect(jsonPath("$[0].cinemaLocation").value("Calamba"))
                .andExpect(jsonPath("$[0].movieId").value(7))
                .andExpect(jsonPath("$[0].cinemaTimeslotList[0]").value("12:00"))
                .andExpect(jsonPath("$[1].cinemaCompany").value("Ayala"))
                .andExpect(jsonPath("$[1].cinemaLocation").value("Ortigas"))
                .andExpect(jsonPath("$[1].movieId").value(7))
                .andExpect(jsonPath("$[1].cinemaTimeslotList[1]").value("13:00"));
    }

}
