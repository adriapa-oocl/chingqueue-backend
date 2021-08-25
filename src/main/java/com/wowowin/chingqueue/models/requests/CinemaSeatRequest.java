package com.wowowin.chingqueue.models.requests;

public class CinemaSeatRequest {

    private Integer seatId;
    private Integer cinemaId;
    private Boolean availability;

    public CinemaSeatRequest(Integer seatId, Integer cinemaId, Boolean availability) {
        this.seatId = seatId;
        this.cinemaId = cinemaId;
        this.availability = availability;
    }

    public CinemaSeatRequest() {
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
}
