package com.travelagence.travelagence.dtos.requestDtos;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Constructeur avec parametres 
@AllArgsConstructor

//Constructeur sans parametre 

@NoArgsConstructor

//Getter
@Getter

//Setter

@Setter

public class DomainResquestDto {

    //Attributs

    private String name;

    private String  phoneNumber;

    private String address;

    private String city;

    private LocalDateTime creationDate;

    private LocalDateTime lastUpdateDate;



}
