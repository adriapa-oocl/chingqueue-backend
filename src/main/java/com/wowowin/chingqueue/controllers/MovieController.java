package com.wowowin.chingqueue.controllers;

import com.wowowin.chingqueue.models.entities.Movie;
import com.wowowin.chingqueue.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Movie addMovie(@RequestBody Movie movie){
        return movieService.addMovie(movie);
    }

    @PutMapping(path = "/{movie_id}")
    public Movie updateMovie(@PathVariable Integer movie_id, @RequestBody Movie movieInfo){
        return movieService.updateMovie(movie_id, movieInfo);
    }

    @DeleteMapping(path = "/{movie_id}")
    public Movie deleteMovie(@PathVariable Integer movie_id){
        return movieService.removeMovie(movie_id);
    }
}
