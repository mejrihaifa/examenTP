package com.example.simulationCreditService.repository;

import com.example.simulationCreditService.dto.BaremeDto;
import com.example.simulationCreditService.entities.DemandeCredit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeCreditRepository extends JpaRepository<DemandeCredit, Long> {
}
