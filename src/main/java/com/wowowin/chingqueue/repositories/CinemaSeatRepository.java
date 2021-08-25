package com.wowowin.chingqueue.repositories;

import com.wowowin.chingqueue.models.entities.CinemaSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaSeatRepository extends JpaRepository <CinemaSeat, Integer> {

    List<CinemaSeat> findAllByCinemaId(Integer cinemaId);
    CinemaSeat findCinemaSeatBySeatIdAndCinemaId(Integer seatId, Integer cinemaId);

}
