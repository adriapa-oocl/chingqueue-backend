package com.wowowin.chingqueue.unitTest;

import com.wowowin.chingqueue.models.entities.Movie;
import com.wowowin.chingqueue.repositories.MovieRepository;
import com.wowowin.chingqueue.services.MovieService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MovieServiceTest {

    private MovieRepository movieRepository;
    private MovieService movieService;

    @BeforeEach
    void setUp() {
        movieRepository = mock(MovieRepository.class);
        movieService = new MovieService(movieRepository);

    }

    @Test
    void should_add_movie_when_call_addmovie_api_given_movie_details() {
        //given
        Movie movie = new Movie(1, "kmovie", "test");

        //when
        when(movieRepository.save(movie)).thenReturn(movie);
        Movie expectedMovie = movieService.addMovie(movie);

        //then
        assertEquals(movie, expectedMovie);

    }

    @Test
    void should_get_all_movie_when_call_get_api() {
        //given
        List<Movie> expectedMovies = asList(new Movie(1, "kmovie", "test"),
                new Movie(2, "kmovie2", "test2"));
        when(movieRepository.findAll()).thenReturn(expectedMovies);

        //when
        List<Movie> actual = movieService.getAllMovies();

        //given
        assertEquals(expectedMovies.size(), actual.size());
    }

    @Test
    void should_update_movie_when_update_by_movie_id_given_id() {
    }

    @Test
    void should_delete_movie_when_delete_by_movie_id_given_employee() {
        //given
        Movie movie = new Movie(1, "kmovie", "test");
        movieService = new MovieService(movieRepository);
        movieService.removeMovie(1);

        verify(movieRepository, times(1)).deleteById(1);
    }

}
