package com.wowowin.chingqueue.controllers;

import com.wowowin.chingqueue.mapper.MovieDetailsMapper;
import com.wowowin.chingqueue.models.entities.MovieDetails;
import com.wowowin.chingqueue.models.requests.MovieDetailsRequest;
import com.wowowin.chingqueue.models.responses.MovieDetailsResponse;
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

    @GetMapping(path = "/{movie_Details_Id}")
    public MovieDetails getMovieDetailsById(@PathVariable Integer movie_Details_Id) {
        return movieDetailsService.getMovieDetailsById(movie_Details_Id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MovieDetailsResponse addMovieDetails(@RequestBody MovieDetailsRequest movieDetailsRequest) {
        return movieDetailsMapper.toResponse(movieDetailsService.addMovieDetails(movieDetailsMapper.toEntity(movieDetailsRequest)));
    }

    @PutMapping(path = "/{movie_Details_Id}")
    public MovieDetailsResponse updateMovieDetails(@PathVariable Integer movie_Details_Id, @RequestBody MovieDetailsRequest movieDetailsRequest) {
        return movieDetailsMapper.toResponse(movieDetailsService.updateMovieDetails(movie_Details_Id, movieDetailsMapper.toEntity(movieDetailsRequest)));
    }

    @DeleteMapping(path = "/{movie_Details_Id}")
    public MovieDetailsResponse deleteMovieDetails(@PathVariable Integer movie_Details_Id) {
        return movieDetailsMapper.toResponse(movieDetailsService.removeMovieDetails(movie_Details_Id));
    }


}
