package com.example.simulationCreditService.dto;



public class DossierCreditDto {
    private Double montant;
    private Integer duree;
    private Double interet;
    private Double mensualite;
    private Long client;
    private Long bareme;

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

    public Long getClient() {
        return client;
    }

    public void setClient(Long client) {
        this.client = client;
    }

    public Long getBareme() {
        return bareme;
    }

    public void setBareme(Long bareme) {
        this.bareme = bareme;
    }
}
