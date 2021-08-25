package com.wowowin.chingqueue.models.entities;

import javax.persistence.*;

@Entity
public class Cinema {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "cinema_sequence")
    @SequenceGenerator(name = "cinema_sequence", sequenceName = "cinema_sequence", allocationSize = 1)
    private Integer cinemaId;
    private String cinemaCompany;
    private String cinemaLocation;
    private Integer movieId;
    private String cinemaTimeslot;

    public Cinema() {
    }

    public Cinema(String cinemaCompany, String cinemaLocation, Integer movieId, String cinemaTimeslot) {
        this.cinemaCompany = cinemaCompany;
        this.cinemaLocation = cinemaLocation;
        this.movieId = movieId;
        this.cinemaTimeslot = cinemaTimeslot;
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
