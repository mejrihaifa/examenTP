package com.example.blacklisteService.repository;

import com.example.blacklisteService.entities.Blackliste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlackListRep extends JpaRepository<Blackliste,Long> {
    boolean existsByCIN(Long CIN);
}
