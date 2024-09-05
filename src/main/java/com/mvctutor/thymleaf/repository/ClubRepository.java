package com.mvctutor.thymleaf.repository;

import com.mvctutor.thymleaf.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClubRepository extends JpaRepository<Club, Long> {

}
