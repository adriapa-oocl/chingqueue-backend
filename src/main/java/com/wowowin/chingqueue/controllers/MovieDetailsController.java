package com.wowowin.chingqueue.controllers;

import com.wowowin.chingqueue.mapper.MovieDetailsMapper;
import com.wowowin.chingqueue.models.entities.MovieDetails;
import com.wowowin.chingqueue.services.MovieDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moviedetails")
public class MovieDetailsController {

    @Autowired
    private MovieDetailsService movieDetailsService;

    @Autowired
    private MovieDetailsMapper movieDetailsMapper;

    public MovieDetailsController(MovieDetailsService movieDetailsService, MovieDetailsMapper movieDetailsMapper) {
        this.movieDetailsService = movieDetailsService;
        this.movieDetailsMapper = movieDetailsMapper;
    }

    @GetMapping
    public List<MovieDetails> getAllMovieDetails() {
        return movieDetailsService.getAllMovieDetails();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MovieDetails addMovieDetails(@RequestBody MovieDetails movieDetails) {
        return movieDetailsService.addMovieDetails(movieDetails);
    }

    @PutMapping(path = "/{movie_Details_Id}")
    public MovieDetails updateMovieDetails(@PathVariable Integer movie_Details_Id, @RequestBody MovieDetails movieDetailsInfo) {
        return movieDetailsService.updateMovieDetails(movie_Details_Id, movieDetailsInfo);
    }

    @DeleteMapping(path = "/{movie_Details_Id}")
    public MovieDetails deleteMovieDetails(@PathVariable Integer movie_Details_Id) {
        return movieDetailsService.removeMovieDetails(movie_Details_Id);
    }


}
