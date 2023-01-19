package com.example.scoreService.services;

import com.example.scoreService.entities.Decision;
import com.example.scoreService.repoisitory.DecisionRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DecisionService {
    @Autowired
    DecisionRep decisionRep;

    public void  addDecision(String evaluation, Long id_demande)
    {
        Decision obj=new Decision();
        obj.setDateDecision(new Date());
        obj.setDemande_id(id_demande);
        obj.setStatut(evaluation=="Vert" ? "Acceptation" : "Refus");
        decisionRep.save(obj);
    }
}
