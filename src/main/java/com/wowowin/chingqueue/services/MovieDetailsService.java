package com.wowowin.chingqueue.services;

import com.wowowin.chingqueue.repositories.MovieDetailsRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieDetailsService {

    private final MovieDetailsRepository movieDetailsRepository;

    public MovieDetailsService(MovieDetailsRepository movieDetailsRepository) {
        this.movieDetailsRepository = movieDetailsRepository;
    }

}
