package com.mvctutor.thymleaf.service.impl;

import com.mvctutor.thymleaf.dto.ClubDto;
import com.mvctutor.thymleaf.models.Club;
import com.mvctutor.thymleaf.repository.ClubRepository;
import com.mvctutor.thymleaf.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubServiceImpl implements ClubService {

    private ClubRepository clubRepository;

    @Autowired
    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubs = clubRepository.findAll();
        return clubs.stream().map((club) -> convertToDto(club)).collect(Collectors.toList());
    }

    private ClubDto convertToDto(Club club) {
        return ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .build();
    }
}
