package com.example.dossierCreditService.entities;


import jakarta.persistence.*;


@Entity
@Table(name = "dossier_credit")
public class DossierCredit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private Double montant;
    private Integer duree;
    private Double interet;
    private Double mensualite;

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

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public Double getInteret() {
        return interet;
    }

    public void setInteret(Double interet) {
        this.interet = interet;
    }

    public Double getMensualite() {
        return mensualite;
    }

    public void setMensualite(Double mensualite) {
        this.mensualite = mensualite;
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
