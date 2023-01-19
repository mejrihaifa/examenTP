package com.example.gestionclient.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private  Long id;

    private String nom;
    private String prenom;
    private Long CIN;
    private Double salaireMensuel;
    private String typeContrat;
    private Date dateNaissance;
    public Client(){

    }
    public Client( String nom, String prenom, Long CIN, Double salaireMensuel, String typeContrat, Date dateNaissance) {


        this.nom = nom;
        this.prenom = prenom;
        this.CIN = CIN;
        this.salaireMensuel = salaireMensuel;
        this.typeContrat = typeContrat;
        this.dateNaissance = dateNaissance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Long getCIN() {
        return CIN;
    }

    public void setCIN(Long CIN) {
        this.CIN = CIN;
    }

    public Double getSalaireMensuel() {
        return salaireMensuel;
    }

    public void setSalaireMensuel(Double salaireMensuel) {
        this.salaireMensuel = salaireMensuel;
    }

    public String getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(String typeContrat) {
        this.typeContrat = typeContrat;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
