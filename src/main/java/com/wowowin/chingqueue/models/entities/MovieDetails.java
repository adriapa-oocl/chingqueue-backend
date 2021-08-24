package com.wowowin.chingqueue.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MovieDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieDetailsId;
    private Integer movieId;
    private String movieDescription;
    private String movieGenre;

    public MovieDetails() {
    }

    public Integer getMovieDetailsId() {
        return movieDetailsId;
    }

    public void setMovieDetailsId(Integer movieDetailsId) {
        this.movieDetailsId = movieDetailsId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }
}
