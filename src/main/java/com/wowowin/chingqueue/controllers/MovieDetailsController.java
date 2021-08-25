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

    @GetMapping(path = "/{movieId}")
    public MovieDetails getMovieDetailsByMovieId(@PathVariable Integer movieId) {
        return movieDetailsService.getMovieDetailsByMovieId(movieId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MovieDetailsResponse addMovieDetails(@RequestBody MovieDetailsRequest movieDetailsRequest) {
        return movieDetailsMapper.toResponse(movieDetailsService.addMovieDetails(movieDetailsMapper.toEntity(movieDetailsRequest)));
    }

    @PutMapping(path = "/{movieId}")
    public MovieDetailsResponse updateMovieDetails(@PathVariable Integer movieId, @RequestBody MovieDetailsRequest movieDetailsRequest) {
        return movieDetailsMapper.toResponse(movieDetailsService.updateMovieDetails(movieId, movieDetailsMapper.toEntity(movieDetailsRequest)));
    }

    @DeleteMapping(path = "/{movieDetailsId}")
    public MovieDetailsResponse deleteMovieDetails(@PathVariable Integer movieDetailsId) {
        return movieDetailsMapper.toResponse(movieDetailsService.removeMovieDetails(movieDetailsId));
    }


}
