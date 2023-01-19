package com.example.scoreService.entities;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "decision")
public class Decision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String statut;

    private Date dateDecision;

    private Long demande_id;

    public Long getId() {
        return id;
    }

    public String getStatut() {
        return statut;
    }

    public Date getDateDecision() {
        return dateDecision;
    }

    public Long getDemande_id() {
        return demande_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setDateDecision(Date dateDecision) {
        this.dateDecision = dateDecision;
    }

    public void setDemande_id(Long demande_id) {
        this.demande_id = demande_id;
    }
}
