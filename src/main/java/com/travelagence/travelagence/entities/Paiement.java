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

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Paiement {

    //Attributs : elements caracterisants un paiement

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type",length = 255)
    private String type;

    @Column(name = "montant_paiement")
    private float montantPaiement;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @Column(name = "lastUpdateDate")
    private LocalDateTime lastUpdateDate;

    @Column(name = 'isDelete')
    private int isDelete;

}
