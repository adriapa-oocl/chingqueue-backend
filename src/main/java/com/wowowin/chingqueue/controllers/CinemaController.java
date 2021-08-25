package com.wowowin.chingqueue.controllers;

import com.wowowin.chingqueue.mapper.CinemaMapper;
import com.wowowin.chingqueue.models.entities.Cinema;
import com.wowowin.chingqueue.models.responses.CinemaResponse;
import com.wowowin.chingqueue.services.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemas")
public class CinemaController {

    @Autowired
    private final CinemaMapper cinemaMapper;

    @Autowired
    private final CinemaService cinemaService;

    public CinemaController(CinemaMapper cinemaMapper, CinemaService cinemaService) {
        this.cinemaMapper = cinemaMapper;
        this.cinemaService = cinemaService;
    }

    @GetMapping
    public List<CinemaResponse> getAllCinemas() {
        return cinemaMapper.toResponseList(cinemaService.getAllCinemas());
    }

    @PostMapping
    public Cinema addCinema(@RequestBody Cinema cinema) {
        return cinemaService.addCinema(cinema);
    }

    @GetMapping(path = "/{movie_id}")
    public List<CinemaResponse> getCinemaByMovieId(@PathVariable Integer movie_id) {
        return cinemaMapper.toResponseList(cinemaService.findCinemaByMovieId(movie_id));
    }


}
