package com.wowowin.chingqueue.models.requests;

public class ReviewRequest {
    private String rating;
    private Integer userId;
    private String reviewContent;
    private Integer movieFk;

    public ReviewRequest(String rating, Integer userId, String reviewContent, Integer movieFk) {
        this.rating = rating;
        this.userId = userId;
        this.reviewContent = reviewContent;
        this.movieFk = movieFk;
    }

    public Integer getMovieFk() {
        return movieFk;
    }

    public void setMovieFk(Integer movieFk) {
        this.movieFk = movieFk;
    }

    public ReviewRequest() {
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }
}
