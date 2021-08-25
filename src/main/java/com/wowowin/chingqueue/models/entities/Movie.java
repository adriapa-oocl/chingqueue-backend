package com.wowowin.chingqueue.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movie_id;
    private String movie_name;
    private String movie_img;


    public Movie(Integer movie_id, String movie_name, String movie_img) {
        this.movie_id = movie_id;
        this.movie_name = movie_name;
        this.movie_img = movie_img;
    }

    public Movie() {

    }

    public Integer getMovie_id() {
        return movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_img() {
        return movie_img;
    }

    public void setMovie_img(String movie_img) {
        this.movie_img = movie_img;
    }
}
