package com.wowowin.chingqueue.services;

import com.wowowin.chingqueue.exception.MovieDetailsNotFound;
import com.wowowin.chingqueue.models.entities.MovieDetails;
import com.wowowin.chingqueue.repositories.MovieDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieDetailsService {

    private final MovieDetailsRepository movieDetailsRepository;

    public MovieDetailsService(MovieDetailsRepository movieDetailsRepository) {
        this.movieDetailsRepository = movieDetailsRepository;
    }

    public List<MovieDetails> getAllMovieDetails() {
        return movieDetailsRepository.findAll();
    }

    public MovieDetails addMovieDetails(MovieDetails MovieDetails) {
        return movieDetailsRepository.save(MovieDetails);
    }

    public MovieDetails updateMovieDetails(Integer movie_Details_Id, MovieDetails movieDetailsInfo) {
        MovieDetails updateMovieDetails = movieDetailsRepository.findById(movie_Details_Id)
                .map(movieDetails -> updateMovieDetailsInfo(movieDetails, movieDetailsInfo))
                .get();
        return movieDetailsRepository.save(updateMovieDetails);
    }

    private MovieDetails updateMovieDetailsInfo(MovieDetails movieDetails, MovieDetails movieDetailsInfo) {
        if (movieDetailsInfo.getMovie_Description() != null) {
            movieDetails.setMovie_Description(movieDetailsInfo.getMovie_Description());
        }

        if (movieDetailsInfo.getMovie_Genre() != null) {
            movieDetails.setMovie_Genre(movieDetailsInfo.getMovie_Genre());
        }

        return movieDetails;
    }

    public MovieDetails removeMovieDetails(Integer movie_Details_Id) {
        Optional<MovieDetails> removeMovieDetails = movieDetailsRepository.findById(movie_Details_Id);
        movieDetailsRepository.deleteById(movie_Details_Id);
        return removeMovieDetails.orElse(null);
    }

    public MovieDetails getMovieDetailsById(Integer movie_Details_Id){
        return movieDetailsRepository.findById(movie_Details_Id).orElseThrow(() -> new MovieDetailsNotFound("Movie Details Not Found"));
    }

}
