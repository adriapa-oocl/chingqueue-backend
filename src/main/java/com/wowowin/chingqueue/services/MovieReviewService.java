package com.wowowin.chingqueue.services;

import com.wowowin.chingqueue.models.entities.MovieDetails;
import com.wowowin.chingqueue.models.entities.MoviesReviews;
import com.wowowin.chingqueue.models.responses.MoviesReviewsResponse;
import com.wowowin.chingqueue.repositories.MovieReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieReviewService {
    @Autowired
    private MovieReviewsRepository movieReviewsRepository;

    public List<MoviesReviews> getAllMovieReviews() {
        return movieReviewsRepository.findAll();

    }

    public MoviesReviews addMovieReview(MoviesReviews moviesReviews) {
        return movieReviewsRepository.save(moviesReviews);
    }
}
