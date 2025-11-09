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

//Constructeurs avec parametres

@AllArgsConstructor

//Constructeur sans parametres

@NoArgsConstructor

//Getter

@Getter

//Setter

@Setter

//Entities
@Entity

public class Domain {


    //Attributs : carateristiques d'un domain

    //Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "phoneNumber",length = 9)
    private String phoneNumber;

    @Column(name = "address",length = 255)
    private String address;

    @Column(name = "city", length = 255)
    private String city;

    @Column(name = "creationDate ")
    private LocalDateTime creationDate;

    @Column(name = "lastUpdateDate")
    private LocalDateTime lastUpdateDate;

    @Column(name = "isDeleted")
    private int isDeleted;

}
