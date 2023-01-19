package com.example.scoreService.controller;

import com.example.scoreService.entities.Score;
import com.example.scoreService.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/score")
public class ScoreController {
    @Autowired
    ScoreService scoreService;

    @RequestMapping(value = "/calcScore/{salaire}/{typeContrat}/{mensualite}", method = RequestMethod.GET)
    public int calcScore(@PathVariable  Double salaire, @PathVariable String typeContrat,@PathVariable Double mensualite)
    {
       return  scoreService.calcScore(salaire,typeContrat,mensualite);
    }
    @RequestMapping(value = "/addScore/{score}/{id_dossierCredit}", method = RequestMethod.POST)
    public Score addScore(int score, Long id_dossierCredit)
    {
        return  scoreService.addScore(score,id_dossierCredit);
    }
}
