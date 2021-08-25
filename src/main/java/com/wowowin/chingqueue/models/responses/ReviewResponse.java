package com.wowowin.chingqueue.models.responses;

import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

public class ReviewResponse {
    private Integer reviewId;
    private String rating;
    private Integer userId;
    private String reviewContent;
    private Integer movieFk;
    private Date createDt;

    public ReviewResponse(Integer reviewId, String rating, Integer userId, String reviewContent, Integer movieFk, Date createDt) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.userId = userId;
        this.reviewContent = reviewContent;
        this.movieFk = movieFk;
        this.createDt = createDt;
    }

    public ReviewResponse() {
    }

    public Integer getMovieFk() {
        return movieFk;
    }

    public void setMovieFk(Integer movieFk) {
        this.movieFk = movieFk;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
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

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }
}
