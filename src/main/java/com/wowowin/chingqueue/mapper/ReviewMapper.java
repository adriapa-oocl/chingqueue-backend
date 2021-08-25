package com.wowowin.chingqueue.mapper;

import com.wowowin.chingqueue.models.entities.Review;
import com.wowowin.chingqueue.models.requests.ReviewRequest;
import com.wowowin.chingqueue.models.responses.ReviewResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReviewMapper {

    public Review toEntity(ReviewRequest reviewRequest) {
        Review review = new Review();
        BeanUtils.copyProperties(reviewRequest, review);
        return review;
    }

    public ReviewResponse toResponse(Review review) {
        ReviewResponse reviewResponse = new ReviewResponse();
        BeanUtils.copyProperties(review, reviewResponse);
        return reviewResponse;
    }

    public List<ReviewResponse> toResponseList(List<Review> reviews) {
        return reviews.stream().map(this::toResponse).collect(Collectors.toList());
    }


}
