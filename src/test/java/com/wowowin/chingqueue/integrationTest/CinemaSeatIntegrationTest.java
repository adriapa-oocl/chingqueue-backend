package com.wowowin.chingqueue.integrationTest;

import com.wowowin.chingqueue.models.entities.CinemaSeat;
import com.wowowin.chingqueue.repositories.CinemaSeatRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CinemaSeatIntegrationTest {

//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private CinemaSeatRepository cinemaSeatRepository;
//
//    @BeforeEach
//    void tearDown() {
//        cinemaSeatRepository.deleteAll();
//    }
//
//    @AfterEach
//    void delete() {
//        cinemaSeatRepository.deleteAll();
//    }

//    @Test
//    void should_return_list_of_cinemaSeats_when_call_getAllCinemaSeats() throws Exception {
//
//        //given
//        CinemaSeat cinemaSeat = new CinemaSeat(1, 1, 1, true);
//        cinemaSeatRepository.save(cinemaSeat);
//
//        //when
//
//        //then
//        mockMvc.perform(get("/cinemaseats"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$[0].cinemaSeatPk").value(1))
//                .andExpect(jsonPath("$[0].seatId").value(1))
//                .andExpect(jsonPath("$[0].cinemaId").value(1))
//                .andExpect(jsonPath("$[0].availability").value(true));
//
//    }
//
//    @Test
//    void should_return_all_correct_cinemaSeat_when_call_getAllCinemaSeatByCinemaId() throws Exception {
//
//        //given
//        CinemaSeat firstCinemaSeat = new CinemaSeat(1, 1, 1, true);
//        cinemaSeatRepository.save(firstCinemaSeat);
//
//        CinemaSeat secondCinemaSeat = new CinemaSeat(2, 2, 1, true);
//        cinemaSeatRepository.save(secondCinemaSeat);
//
//        CinemaSeat thirdCinemaSeat = new CinemaSeat(3, 1, 2, true);
//        cinemaSeatRepository.save(thirdCinemaSeat);
//
//        //when
//
//        //then
//        mockMvc.perform(get("/cinemaseats/{cinemaId}", 1))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$[0].seatId").value(1))
//                .andExpect(jsonPath("$[0].cinemaId").value(1))
//                .andExpect(jsonPath("$[0].availability").value(true))
//                .andExpect(jsonPath("$[1].seatId").value(2))
//                .andExpect(jsonPath("$[1].cinemaId").value(1))
//                .andExpect(jsonPath("$[1].availability").value(true));
//    }
//
//    @Test
//    void should_update_cinemaSeats_when_call_updateCinemaSeat() throws Exception {
//
//        //given
//        CinemaSeat cinemaSeat = new CinemaSeat(1, 1, 1, true);
//        cinemaSeatRepository.save(cinemaSeat);
//
//        String cinemaSeatJson = "{\n" +
//                "        \"cinemaId\": 1,\n" +
//                "        \"availability\": false\n" +
//                "}";
//
//        //when
//
//        //then
//        //then
//        mockMvc.perform(put("/cinemaseats/{movie_id}", 1)
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(cinemaSeatJson))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.cinemaSeatPk").value(1))
//                .andExpect(jsonPath("$.seatId").value(1))
//                .andExpect(jsonPath("$.cinemaId").value(1))
//                .andExpect(jsonPath("$.availability").value(false));
//
//    }

}
