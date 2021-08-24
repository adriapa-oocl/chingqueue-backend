package com.wowowin.chingqueue.repositories;

import com.wowowin.chingqueue.models.entities.MovieDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDetailsRepository extends JpaRepository <MovieDetails, Integer> {
}
