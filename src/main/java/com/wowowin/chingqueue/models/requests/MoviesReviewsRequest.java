package com.wowowin.chingqueue.models.requests;

public class MoviesReviewsRequest {
    private Integer movie_details_id;
    private Integer user_id;
    private String review_content;

    public MoviesReviewsRequest(Integer movie_details_id, Integer user_id, String review_content) {
        this.movie_details_id = movie_details_id;
        this.user_id = user_id;
        this.review_content = review_content;
    }

    public MoviesReviewsRequest() {
    }

    public Integer getMovie_details_id() {
        return movie_details_id;
    }

    public void setMovie_details_id(Integer movie_details_id) {
        this.movie_details_id = movie_details_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getReview_content() {
        return review_content;
    }

    public void setReview_content(String review_content) {
        this.review_content = review_content;
    }


}
