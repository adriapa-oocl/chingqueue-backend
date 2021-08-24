package com.wowowin.chingqueue.models.entities;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class MoviesReviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewId;
    private Integer movie_details_id;
    private Integer user_id;
    @CreationTimestamp
    private Date create_dt;
    private String review_content;

    public MoviesReviews(Integer reviewId, Integer movie_details_id, Integer userId, Date create_dt, String review_content) {
        this.reviewId = reviewId;
        this.movie_details_id = movie_details_id;
        this.user_id = userId;
        this.create_dt = create_dt;
        this.review_content = review_content;
    }

    public MoviesReviews() {
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
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

    public Date getCreate_dt() {
        return create_dt;
    }

    public void setCreate_dt(Date create_dt) {
        this.create_dt = create_dt;
    }

    public String getReview_content() {
        return review_content;
    }

    public void setReview_content(String review_content) {
        this.review_content = review_content;
    }
}
