package com.wowowin.chingqueue.services;

import com.wowowin.chingqueue.models.entities.Movie;
import com.wowowin.chingqueue.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie updateMovie(Integer movie_id, Movie movieInfo) {
        Movie updateMovie = movieRepository.findById(movie_id)
                            .map(movie -> updateMovieInfo(movie, movieInfo))
                            .get();
        return movieRepository.save(updateMovie);
    }

    private Movie updateMovieInfo(Movie movie, Movie movieInfo) {
        if (movie.getMovie_name() != null){
            movie.setMovie_name(movieInfo.getMovie_name());
        }

        return movie;
    }

    public Movie removeMovie(Integer movie_id) {
        Optional<Movie> removeMovie = movieRepository.findById(movie_id);
        movieRepository.deleteById(movie_id);
        return removeMovie.orElse(null);
    }
}
