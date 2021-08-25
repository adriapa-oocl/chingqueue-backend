package com.wowowin.chingqueue.services;

import com.wowowin.chingqueue.models.entities.CinemaSeat;
import com.wowowin.chingqueue.repositories.CinemaSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaSeatService {

    @Autowired
    private CinemaSeatRepository cinemaSeatRepository;

    public CinemaSeatService(CinemaSeatRepository cinemaSeatRepository) {
        this.cinemaSeatRepository = cinemaSeatRepository;
    }

    public List<CinemaSeat> findAllCinemaSeatByCinemaId(Integer cinemaId) {
        return cinemaSeatRepository.findAllByCinemaId(cinemaId);
    }

    public CinemaSeat updateCinemaSeat(Integer seatId, CinemaSeat cinemaSeatInfo) {
        CinemaSeat cinemaSeat = cinemaSeatRepository.findCinemaSeatBySeatIdAndCinemaId(seatId, cinemaSeatInfo.getCinemaId());
        cinemaSeat = updateCinemaSeatInfo(cinemaSeat, cinemaSeatInfo);

        return cinemaSeatRepository.save(cinemaSeat);
    }

    private CinemaSeat updateCinemaSeatInfo(CinemaSeat cinemaSeat, CinemaSeat cinemaSeatInfo) {

        if (cinemaSeatInfo.getAvailability() != null) {
            cinemaSeat.setAvailability(cinemaSeatInfo.getAvailability());
        }

        return cinemaSeat;
    }

    public List<CinemaSeat> getAllCinemaSeats() {
        return cinemaSeatRepository.findAll();
    }

}
