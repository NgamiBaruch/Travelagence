package com.travelagence.travelagence.dtos.requestDtos;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Constructeurs avec parametre

@AllArgsConstructor

//Conctructeur sans parametre

@NoArgsConstructor

//Getter

@Getter

//Setter
@Setter

public class PaiementResquestDto {

    //Attributs necessaire a la creation d'un paiement


    //Type de paiement
    private String type;

    //montant du paiement

    private float montantPaiement;

    //Date de creation du paiement

    private LocalDateTime creationDate;

    //Date de dernier mdification 

    private LocalDateTime lastUpdateDate;

    //indexe de modification

    private int isDelete;

}
