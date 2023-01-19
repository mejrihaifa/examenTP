package com.example.catalogueBaremeService.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "bareme")
public class Bareme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double tauxNominal;
    private Integer dureeMin;
    private Integer dureeMax;
    private double montantMin;
    private double montantMax;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTauxNominal() {
        return tauxNominal;
    }

    public void setTauxNominal(Double tauxNominal) {
        this.tauxNominal = tauxNominal;
    }

    public Integer getDureeMin() {
        return dureeMin;
    }

    public void setDureeMin(Integer dureeMin) {
        this.dureeMin = dureeMin;
    }

    public Integer getDureeMax() {
        return dureeMax;
    }

    public void setDureeMax(Integer dureeMax) {
        this.dureeMax = dureeMax;
    }

    public Double getMontantMin() {
        return montantMin;
    }

    public void setMontantMin(Double montantMin) {
        this.montantMin = montantMin;
    }

    public Double getMontantMax() {
        return montantMax;
    }

    public void setMontantMax(Double montantMax) {
        this.montantMax = montantMax;
    }
}
