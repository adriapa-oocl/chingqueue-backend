package com.wowowin.chingqueue.mapper;

import com.wowowin.chingqueue.models.entities.MovieDetails;
import com.wowowin.chingqueue.models.requests.MovieDetailsRequest;
import com.wowowin.chingqueue.models.responses.MovieDetailsResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MovieDetailsMapper {

    public MovieDetails toEntity(MovieDetailsRequest movieDetailsRequest) {
        MovieDetails movieDetails = new MovieDetails();
        BeanUtils.copyProperties(movieDetailsRequest, movieDetails);
        return movieDetails;
    }

    public MovieDetailsResponse toResponse(MovieDetails movieDetails) {
        MovieDetailsResponse movieDetailsResponse = new MovieDetailsResponse();
        BeanUtils.copyProperties(movieDetails, movieDetailsResponse);

        return movieDetailsResponse;
    }

}
