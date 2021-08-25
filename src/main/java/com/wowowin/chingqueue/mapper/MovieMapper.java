package com.wowowin.chingqueue.mapper;

import com.wowowin.chingqueue.models.entities.Movie;
import com.wowowin.chingqueue.models.requests.MovieRequest;
import com.wowowin.chingqueue.models.responses.MovieResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MovieMapper {
    public Movie toEntity(MovieRequest movieRequest) {
        Movie movie = new Movie();
        BeanUtils.copyProperties(movieRequest, movie);
        return movie;
    }

    public MovieResponse toResponse(Movie movie) {
        MovieResponse movieResponse = new MovieResponse();
        BeanUtils.copyProperties(movie, movieResponse);
        return movieResponse;
    }

    public List<MovieResponse> toResponseList(List<Movie> movie) {
       List<MovieResponse> movieResponse  = movie.stream().map(this::toResponse).collect(Collectors.toList());
        return movieResponse;
    }
}
