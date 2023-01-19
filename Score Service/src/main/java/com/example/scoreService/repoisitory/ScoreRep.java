package com.example.scoreService.repoisitory;

import com.example.scoreService.entities.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRep extends JpaRepository<Score,Long> {
}
