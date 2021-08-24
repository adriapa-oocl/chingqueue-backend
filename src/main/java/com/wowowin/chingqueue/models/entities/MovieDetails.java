package com.wowowin.chingqueue.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MovieDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movie_Details_Id;
    private Integer movie_Id;
    private String movie_Description;
    private String movie_Genre;

    public MovieDetails() {
    }

    public Integer getMovie_Details_Id() {
        return movie_Details_Id;
    }

    public void setMovie_Details_Id(Integer movie_Details_Id) {
        this.movie_Details_Id = movie_Details_Id;
    }

    public Integer getMovie_Id() {
        return movie_Id;
    }

    public void setMovie_Id(Integer movie_Id) {
        this.movie_Id = movie_Id;
    }

    public String getMovie_Description() {
        return movie_Description;
    }

    public void setMovie_Description(String movie_Description) {
        this.movie_Description = movie_Description;
    }

    public String getMovie_Genre() {
        return movie_Genre;
    }

    public void setMovie_Genre(String movie_Genre) {
        this.movie_Genre = movie_Genre;
    }
}
