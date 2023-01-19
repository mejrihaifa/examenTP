package com.example.simulationCreditService.entities;


import com.example.simulationCreditService.dto.BaremeDto;
import com.example.simulationCreditService.dto.ClientDto;
import jakarta.persistence.*;

@Entity
@Table(name = "demande_credit")
public class DemandeCredit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double montant;

    private int duree;

    private Long client_id;

    private Long bareme_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public Long getBareme_id() {
        return bareme_id;
    }

    public void setBareme_id(Long bareme_id) {
        this.bareme_id = bareme_id;
    }
}
