package com.example.scoreService.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "score")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private int score;
    private String evaluation;

    private Long dossier_id;

    public void setId(Long id) {
        this.id = id;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public void setDossier_id(Long dossier_id) {
        this.dossier_id = dossier_id;
    }

    public Long getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public Long getDossier_id() {
        return dossier_id;
    }
}
