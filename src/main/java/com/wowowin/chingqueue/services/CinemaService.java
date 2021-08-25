package com.wowowin.chingqueue.services;

import com.wowowin.chingqueue.models.entities.Cinema;
import com.wowowin.chingqueue.repositories.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;

    public CinemaService(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    public List<Cinema> getAllCinemas() {
        return cinemaRepository.findAll();
    }

    public Cinema addCinema(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }

    public List<Cinema> findCinemaByMovieId(Integer movieId) {
        return cinemaRepository.findAllByMovieId(movieId);
    }

}
