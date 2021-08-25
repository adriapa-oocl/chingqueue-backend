package com.wowowin.chingqueue.controllers;

import com.wowowin.chingqueue.models.entities.CinemaSeat;
import com.wowowin.chingqueue.services.CinemaSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemaseats")
public class CinemaSeatController {

    @Autowired
    private final CinemaSeatService cinemaSeatService;

    public CinemaSeatController(CinemaSeatService cinemaSeatService) {
        this.cinemaSeatService = cinemaSeatService;
    }

    @GetMapping(path = "/{cinemaId}")
    public List<CinemaSeat> getAllCinemaSeatByCinemaId(@PathVariable Integer cinemaId) {
        return cinemaSeatService.findAllCinemaSeatByCinemaId(cinemaId);
    }

    @PutMapping(path = "/{seatId}")
    public CinemaSeat updateCinemaSeat(@PathVariable Integer seatId, @RequestBody CinemaSeat cinemaSeat) {
        return cinemaSeatService.updateCinemaSeat(seatId, cinemaSeat);
    }

    @GetMapping
    public List<CinemaSeat> getAllCinemaSeats() {
        return cinemaSeatService.getAllCinemaSeats();
    }

}
