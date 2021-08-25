package com.wowowin.chingqueue.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cinemaId;
    private String cinemaCompany;
    private String cinemaLocation;
    private Integer movieId;
    private String cinemaTimeslot;

    public Cinema() {
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getCinemaCompany() {
        return cinemaCompany;
    }

    public void setCinemaCompany(String cinemaCompany) {
        this.cinemaCompany = cinemaCompany;
    }

    public String getCinemaLocation() {
        return cinemaLocation;
    }

    public void setCinemaLocation(String cinemaLocation) {
        this.cinemaLocation = cinemaLocation;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getCinemaTimeslot() {
        return cinemaTimeslot;
    }

    public void setCinemaTimeslot(String cinemaTimeslot) {
        this.cinemaTimeslot = cinemaTimeslot;
    }
}
