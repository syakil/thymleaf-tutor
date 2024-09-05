package com.mvctutor.thymleaf.Api.controller;

import com.mvctutor.thymleaf.dto.ClubDto;
import com.mvctutor.thymleaf.dto.ResponseHelper;
import com.mvctutor.thymleaf.models.Club;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clubs")
public class ApiClubController {

    @GetMapping
    public ResponseEntity<ResponseHelper<ClubDto>> getClubs() {
        Club club = Club.builder()
                .id(1L)
                .title("Real Madrid")
                .photoUrl("https://upload.wikimedia.org/wikipedia/en/3/3f/Real_Madrid_Club_de_F%C3%BAtbol.png")
                .content("Real Madrid Club de Fútbol, commonly referred to as Real Madrid, is a Spanish professional football club based in Madrid.")
                .build();
        ClubDto clubDto = ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .build();
        ResponseHelper<ClubDto> response = new ResponseHelper<>();
        response.setData(clubDto);
        return ResponseEntity.ok(response);
    }
}
