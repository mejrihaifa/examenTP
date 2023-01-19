package com.example.gestionclient.repoisitory;

import com.example.gestionclient.entities.DemandeCredit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeCreditRep  extends JpaRepository<DemandeCredit,Long> {
}
