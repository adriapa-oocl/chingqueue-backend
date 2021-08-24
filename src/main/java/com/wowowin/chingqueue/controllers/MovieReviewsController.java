package com.wowowin.chingqueue.controllers;


import com.wowowin.chingqueue.mapper.MovieReviewMapper;
import com.wowowin.chingqueue.models.entities.MoviesReviews;
import com.wowowin.chingqueue.models.requests.MoviesReviewsRequest;
import com.wowowin.chingqueue.models.responses.MoviesReviewsResponse;
import com.wowowin.chingqueue.services.MovieReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie-reviews")
public class MovieReviewsController {

    @Autowired
    private MovieReviewService movieReviewService;


    @Autowired
    private MovieReviewMapper movieReviewMapper;

    @GetMapping
    public List<MoviesReviews> getAllMovieReviews() {
        return movieReviewService.getAllMovieReviews();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MoviesReviewsResponse addMovieReview(@RequestBody MoviesReviewsRequest moviesReviewsRequest) {

        return movieReviewMapper.toResponse(movieReviewService.addMovieReview(movieReviewMapper.toEntity(moviesReviewsRequest)));

//        return movieReviewService.addMovieReview(moviesReviews
//        );

    }


}
