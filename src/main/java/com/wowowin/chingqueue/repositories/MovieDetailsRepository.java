package com.wowowin.chingqueue.repositories;

import com.wowowin.chingqueue.models.entities.MovieDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieDetailsRepository extends JpaRepository <MovieDetails, Integer> {
    MovieDetails findByMovieId(Integer movieId);
}
