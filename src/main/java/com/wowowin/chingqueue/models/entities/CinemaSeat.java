package com.wowowin.chingqueue.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "CINEMA_SEAT")
public class CinemaSeat {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "cinema_seat_sequence")
    @SequenceGenerator(name = "cinema_seat_sequence",sequenceName = "cinema_seat_sequence", allocationSize = 1)
    private Integer cinemaSeatPk;
    private Integer seatId;
    private Integer cinemaId;
    private Boolean availability;

    public CinemaSeat() {
    }

    public CinemaSeat(Integer cinemaSeatPk, Integer seatId, Integer cinemaId, Boolean availability) {
        this.cinemaSeatPk = cinemaSeatPk;
        this.seatId = seatId;
        this.cinemaId = cinemaId;
        this.availability = availability;
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

    public void setAvailability(Boolean available) {
        availability = available;
    }

    public Integer getCinemaSeatPk() {
        return cinemaSeatPk;
    }

    public void setCinemaSeatPk(Integer cinemaSeatPk) {
        this.cinemaSeatPk = cinemaSeatPk;
    }
}
