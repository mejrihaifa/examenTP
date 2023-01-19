package com.example.scoreService.services;

import com.example.scoreService.entities.Score;
import com.example.scoreService.repoisitory.ScoreRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {
    @Autowired
    ScoreRep scoreRep;

    public int calcScore(Double salaire, String typeContrat, Double mensualite)
    {
        int score=0;
        if (salaire >200)
        {
            score=score+20;
        }
        if (salaire >1000 && salaire<2000)
        {
            score=score+10;
        }
        if(typeContrat=="CDI")
        {
            score=score+30;
        }
        if(mensualite/salaire<0.45)
        {
            score=score+50;
        }
        return  score;



    }
    public Score addScore(int score, Long id_dossierCredit)
    {
        Score obj= new Score();
        obj.setScore(score);
        obj.setEvaluation(score<50 ? "Rouge" : "Vert");
        obj.setDossier_id(id_dossierCredit);
        return scoreRep.save(obj);
    }
}
