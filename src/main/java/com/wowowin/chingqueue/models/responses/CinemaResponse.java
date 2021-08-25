package com.wowowin.chingqueue.models.responses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CinemaResponse {

    private Integer cinemaId;
    private String cinemaCompany;
    private String cinemaLocation;
    private Integer movieId;
    private String cinemaTimeslot;
    private List<String> cinemaTimeslotList;

    public CinemaResponse(Integer cinemaId, String cinemaCompany, String cinemaLocation, Integer movieId, String cinemaTimeslot, List<String> cinemaTimeslotList) {
        this.cinemaId = cinemaId;
        this.cinemaCompany = cinemaCompany;
        this.cinemaLocation = cinemaLocation;
        this.movieId = movieId;
        this.cinemaTimeslot = cinemaTimeslot;
        this.cinemaTimeslotList = cinemaTimeslotList;
    }

    public CinemaResponse() {
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

    public List<String> getCinemaTimeslotList() {
        return cinemaTimeslotList;
    }

    public void setCinemaTimeslotList(List<String> cinemaTimeslotList) {
        this.cinemaTimeslotList = cinemaTimeslotList;
    }

    public void splitTimeSlot() {
        cinemaTimeslotList = new ArrayList<>(Arrays.asList(cinemaTimeslot.split(";")));
    }
}
