package com.wowowin.chingqueue.mapper;


import com.wowowin.chingqueue.models.entities.MoviesReviews;
import com.wowowin.chingqueue.models.requests.MoviesReviewsRequest;
import com.wowowin.chingqueue.models.responses.MoviesReviewsResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MovieReviewMapper {

    public MoviesReviews toEntity(MoviesReviewsRequest moviesReviewsRequest) {
        MoviesReviews moviesReviews = new MoviesReviews();
        BeanUtils.copyProperties(moviesReviewsRequest, moviesReviews);
        return moviesReviews;

    }

    public MoviesReviewsResponse toResponse(MoviesReviews moviesReviews) {
        MoviesReviewsResponse moviesReviewsResponse = new MoviesReviewsResponse();
        BeanUtils.copyProperties(moviesReviews, moviesReviewsResponse);

        return moviesReviewsResponse;
    }


}
