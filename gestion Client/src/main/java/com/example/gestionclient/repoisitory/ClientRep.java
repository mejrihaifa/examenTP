package com.example.gestionclient.repoisitory;

import com.example.gestionclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface ClientRep extends JpaRepository<Client,Long> {
    Client findByCIN(Long CIN);
}
