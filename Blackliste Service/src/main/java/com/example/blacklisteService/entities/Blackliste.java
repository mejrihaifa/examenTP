package com.example.blacklisteService.entities;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "blackliste")
public class Blackliste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long CIN;
    private String raison;
    private Date dateAjout;
}
