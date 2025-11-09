package com.travelagence.travelagence.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Constructeur avec parametre

@AllArgsConstructor

//Constructeur sans parametre
@NoArgsConstructor

//Preciser qu'il s'agit d'une entite 

@Entity

//Getter

@Getter

//Setter

@Setter

public class Retour {

    // Attributs

    //Indiquer qu'il s agit de la cle primaire
    @Id

    //Presicer que la cle primaire se genere automatiquement
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Identifiant du retour
    private Long id;

    @Column(name = "message", length = 255)
    private String message;

    @Column(name = "objet", length = 255)
    private String objet;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @Column(name = "last_update_date")
    private LocalDateTime lastUpdateDate;

    @Column(name = "is_deleted")
    private int isDeleted;



}
