package com.example.scoreService.repoisitory;

import com.example.scoreService.entities.Decision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DecisionRep extends JpaRepository<Decision,Long> {
}
