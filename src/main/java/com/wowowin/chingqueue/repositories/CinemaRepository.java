package com.wowowin.chingqueue.repositories;

import com.wowowin.chingqueue.models.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Integer> {

    List<Cinema> findAllByMovieId(Integer movieId);

}
