package com.wowowin.chingqueue.mapper;

import com.wowowin.chingqueue.models.entities.CinemaSeat;
import com.wowowin.chingqueue.models.requests.CinemaSeatRequest;
import com.wowowin.chingqueue.models.responses.CinemaSeatResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CinemaSeatMapper {

    public CinemaSeatResponse toResponse(CinemaSeat cinemaSeat) {
        CinemaSeatResponse cinemaSeatResponse = new CinemaSeatResponse();
        BeanUtils.copyProperties(cinemaSeat, cinemaSeatResponse);
        return cinemaSeatResponse;
    }

    public List<CinemaSeatResponse> toResponseList(List<CinemaSeat> cinemaSeatList) {
        return cinemaSeatList.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    public CinemaSeat toEntity(CinemaSeatRequest cinemaSeatRequest) {
        CinemaSeat cinemaSeat = new CinemaSeat();
        BeanUtils.copyProperties(cinemaSeatRequest, cinemaSeat);
        return cinemaSeat;
    }


}
