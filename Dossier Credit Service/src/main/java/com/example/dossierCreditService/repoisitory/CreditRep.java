package com.example.dossierCreditService.repoisitory;

import com.example.dossierCreditService.entities.DossierCredit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRep extends JpaRepository<DossierCredit,Long> {
}
