package com.wowowin.chingqueue.controllers;

import com.wowowin.chingqueue.mapper.CinemaSeatMapper;
import com.wowowin.chingqueue.models.requests.CinemaSeatRequest;
import com.wowowin.chingqueue.models.responses.CinemaSeatResponse;
import com.wowowin.chingqueue.services.CinemaSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemaseats")
public class CinemaSeatController {

    @Autowired
    private final CinemaSeatService cinemaSeatService;

    @Autowired
    private final CinemaSeatMapper cinemaSeatMapper;

    public CinemaSeatController(CinemaSeatService cinemaSeatService, CinemaSeatMapper cinemaSeatMapper) {
        this.cinemaSeatService = cinemaSeatService;
        this.cinemaSeatMapper = cinemaSeatMapper;
    }

    @GetMapping(path = "/{cinemaId}")
    public List<CinemaSeatResponse> getAllCinemaSeatByCinemaId(@PathVariable Integer cinemaId) {
        return cinemaSeatMapper.toResponseList(cinemaSeatService.findAllCinemaSeatByCinemaId(cinemaId));
    }

    @PutMapping(path = "/{seatId}")
    public CinemaSeatResponse updateCinemaSeat(@PathVariable Integer seatId, @RequestBody CinemaSeatRequest cinemaSeatRequest) {
        return cinemaSeatMapper.toResponse(cinemaSeatService.updateCinemaSeat(seatId, cinemaSeatMapper.toEntity(cinemaSeatRequest)));
    }

    @GetMapping
    public List<CinemaSeatResponse> getAllCinemaSeats() {
        return cinemaSeatMapper.toResponseList(cinemaSeatService.getAllCinemaSeats());
    }

}
