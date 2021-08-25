package com.wowowin.chingqueue.services;

import com.wowowin.chingqueue.models.entities.Review;
import com.wowowin.chingqueue.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getAllMovies() {
        return reviewRepository.findAll();
    }

    public Review addReview(Review reviewToAdd) {
        return reviewRepository.save(reviewToAdd);
    }

    public void deleteReview(Integer review_id) {
        reviewRepository.deleteById(review_id);
    }
}
