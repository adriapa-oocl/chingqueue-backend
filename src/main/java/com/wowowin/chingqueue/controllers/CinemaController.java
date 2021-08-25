package com.wowowin.chingqueue.controllers;

import com.wowowin.chingqueue.models.entities.Cinema;
import com.wowowin.chingqueue.services.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemas")
public class CinemaController {

    @Autowired
    private final CinemaService cinemaService;

    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @GetMapping
    public List<Cinema> getAllCinemas() {
        return cinemaService.getAllCinemas();
    }

    @PostMapping
    public Cinema addCinema(@RequestBody Cinema cinema) {
        return cinemaService.addCinema(cinema);
    }

    @GetMapping(path = "/{movie_id}")
    public Cinema getCinemaByMovieId(@PathVariable Integer movie_id) {
        return cinemaService.findCinemaByMovieId(movie_id);
    }


}
