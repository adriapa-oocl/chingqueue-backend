package com.wowowin.chingqueue.models.entities;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewId;
    private String rating;
    private Integer userId;
    private String reviewContent;
    private Integer movieFk;
    @CreationTimestamp
    private Date createDt;

    public Review(Integer reviewId, String rating, Integer userId, String reviewContent, Date createDt) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.userId = userId;
        this.reviewContent = reviewContent;
        this.createDt = createDt;
    }

    public Review(Integer reviewId, String rating, Integer userId, String reviewContent, Integer movieFk, Date createDt) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.userId = userId;
        this.reviewContent = reviewContent;
        this.movieFk = movieFk;
        this.createDt = createDt;
    }

    public Review() {
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

    public Integer getMovieFk() {
        return movieFk;
    }

    public void setMovieFk(Integer movieFk) {
        this.movieFk = movieFk;
    }
}
