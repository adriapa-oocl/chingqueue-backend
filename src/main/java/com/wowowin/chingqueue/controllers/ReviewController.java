package com.wowowin.chingqueue.controllers;

import com.wowowin.chingqueue.mapper.ReviewMapper;
import com.wowowin.chingqueue.models.entities.Review;
import com.wowowin.chingqueue.models.requests.ReviewRequest;
import com.wowowin.chingqueue.models.requests.UserRequest;
import com.wowowin.chingqueue.models.responses.ReviewResponse;
import com.wowowin.chingqueue.models.responses.UserResponse;
import com.wowowin.chingqueue.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private  ReviewService reviewService;

    @Autowired
    private ReviewMapper reviewMapper;

    public ReviewController(ReviewService reviewService, ReviewMapper reviewMapper) {
        this.reviewService = reviewService;
        this.reviewMapper = reviewMapper;
    }

    @GetMapping
    public List<ReviewResponse> getAllReviews(){

        return reviewMapper.toResponseList(reviewService.getAllMovies());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Review addReview(@RequestBody Review review) {
        return (reviewService.addReview(review));
    }

    @DeleteMapping(path = "/{review_id}")
    public void deleteReview(@PathVariable Integer review_id){
        reviewService.deleteReview(review_id);
    }
}
