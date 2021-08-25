package com.wowowin.chingqueue.models.responses;

public class CinemaSeatResponse {

    private Integer cinemaSeatPk;
    private Integer seatId;
    private Integer cinemaId;
    private Boolean availability;

    public CinemaSeatResponse(Integer cinemaSeatPk, Integer seatId, Integer cinemaId, Boolean availability) {
        this.cinemaSeatPk = cinemaSeatPk;
        this.seatId = seatId;
        this.cinemaId = cinemaId;
        this.availability = availability;
    }

    public CinemaSeatResponse() {
    }

    public Integer getCinemaSeatPk() {
        return cinemaSeatPk;
    }

    public void setCinemaSeatPk(Integer cinemaSeatPk) {
        this.cinemaSeatPk = cinemaSeatPk;
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
