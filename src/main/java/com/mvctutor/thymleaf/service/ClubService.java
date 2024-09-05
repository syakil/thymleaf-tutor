package com.mvctutor.thymleaf.service;

import com.mvctutor.thymleaf.dto.ClubDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClubService {
    List<ClubDto> findAllClubs();
}
