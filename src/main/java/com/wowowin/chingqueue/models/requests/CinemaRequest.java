package com.wowowin.chingqueue.models.requests;

public class CinemaRequest {

    private String cinemaCompany;
    private String cinemaLocation;
    private Integer movieId;
    private String cinemaTimeslot;

    public CinemaRequest() {
    }

    public CinemaRequest(String cinemaCompany, String cinemaLocation, Integer movieId, String cinemaTimeslot) {
        this.cinemaCompany = cinemaCompany;
        this.cinemaLocation = cinemaLocation;
        this.movieId = movieId;
        this.cinemaTimeslot = cinemaTimeslot;
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
