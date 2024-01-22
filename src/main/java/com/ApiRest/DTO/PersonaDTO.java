package com.ApiRest.DTO;

import jakarta.persistence.Basic;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersonaDTO {

    Long id;
    String ubication;
    String position;
    String full_name;
    String image;

    public PersonaDTO(Long id, String ubication, String position, String full_name, String image){
        this.id = id;
        this.ubication = ubication;
        this.position = position;
        this.full_name = full_name;
        this.image = image;
    }

    public PersonaDTO(){

    }
}
