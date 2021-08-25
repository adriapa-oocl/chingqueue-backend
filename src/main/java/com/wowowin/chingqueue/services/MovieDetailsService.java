package com.wowowin.chingqueue.services;

import com.wowowin.chingqueue.exception.MovieDetailsNotFound;
import com.wowowin.chingqueue.models.entities.MovieDetails;
import com.wowowin.chingqueue.repositories.MovieDetailsRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
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

    public MovieDetails updateMovieDetails(Integer movieDetailsId, MovieDetails movieDetailsInfo) {
        return Optional.of(getMovieDetailsByMovieId(movieDetailsId))
                .map(movieDetails -> updateMovieDetailsInfo(movieDetails, movieDetailsInfo))
                .map(this::addMovieDetails)
                .orElse(null);
    }

    private MovieDetails updateMovieDetailsInfo(MovieDetails movieDetails, MovieDetails movieDetailsInfo) {
        if (movieDetailsInfo.getMovieDescription() != null) {
            movieDetails.setMovieDescription(movieDetailsInfo.getMovieDescription());
        }

        if (movieDetailsInfo.getMovieGenre() != null) {
            movieDetails.setMovieGenre(movieDetailsInfo.getMovieGenre());
        }

        return movieDetails;
    }

    public MovieDetails removeMovieDetails(Integer movieDetailsId) {
        MovieDetails removeMovieDetails = movieDetailsRepository.findById(movieDetailsId).orElseThrow(() -> new MovieDetailsNotFound("Movie Details does not exists"));
        movieDetailsRepository.deleteById(movieDetailsId);
        return removeMovieDetails;
    }

    public MovieDetails getMovieDetailsByMovieId(Integer movieId){
        MovieDetails movieDetails = movieDetailsRepository.findByMovieId(movieId);

        if (movieDetails == null) {
            throw new MovieDetailsNotFound("Movie Details does not exists");
        }

        return movieDetails;
    }

}
