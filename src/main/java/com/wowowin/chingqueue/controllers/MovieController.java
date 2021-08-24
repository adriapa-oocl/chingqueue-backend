package com.wowowin.chingqueue.controllers;

import com.wowowin.chingqueue.mapper.MovieMapper;
import com.wowowin.chingqueue.models.entities.Movie;
import com.wowowin.chingqueue.models.requests.MovieRequest;
import com.wowowin.chingqueue.models.responses.MovieResponse;
import com.wowowin.chingqueue.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private final MovieService movieService;

    @Autowired
    private  MovieMapper movieMapper;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping
    public List<MovieResponse> getAllMovies(){
        return movieMapper.toResponseList(movieService.getAllMovies());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MovieResponse addMovie(@RequestBody MovieRequest movieRequest){
        return movieMapper.toResponse(movieService.addMovie(movieMapper.toEntity(movieRequest)));
    }

    @PutMapping(path = "/{movie_id}")
    public MovieResponse updateMovie(@PathVariable Integer movie_id, @RequestBody MovieRequest movieRequest){
        return movieMapper.toResponse(movieService.updateMovie(movie_id,movieMapper.toEntity(movieRequest)));
    }

    @DeleteMapping(path = "/{movie_id}")
    public Movie deleteMovie(@PathVariable Integer movie_id){
        return movieService.removeMovie(movie_id);
    }

}
