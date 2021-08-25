package com.wowowin.chingqueue.mapper;

import com.wowowin.chingqueue.models.entities.Cinema;
import com.wowowin.chingqueue.models.requests.CinemaRequest;
import com.wowowin.chingqueue.models.responses.CinemaResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CinemaMapper {

    public CinemaResponse toResponse(Cinema cinema) {
        CinemaResponse cinemaResponse = new CinemaResponse();
        BeanUtils.copyProperties(cinema, cinemaResponse);
        return cinemaResponse;
    }

    public List<CinemaResponse> toResponseList(List<Cinema> cinemas) {
        return cinemas.stream()
                .map(this::toResponse)
                .map(CinemaResponse::splitTimeSlot)
                .collect(Collectors.toList());
    }

    public Cinema toEntity(CinemaRequest cinemaRequest) {
        Cinema cinema = new Cinema();
        BeanUtils.copyProperties(cinemaRequest, cinema);
        return cinema;
    }

}
