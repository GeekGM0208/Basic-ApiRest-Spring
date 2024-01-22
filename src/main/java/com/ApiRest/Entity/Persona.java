package com.ApiRest.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String ubication;
    String position;
    String full_name;
    String image;
    String user;
    String password;

    public Persona(Long id, String full_name, String ubication, String position, String image,
                   String user, String password){
        this.id = id;
        this.full_name = full_name;
        this.ubication = ubication;
        this.position = position;
        this.image = image;
        this.user = user;
        this.password = password;

    }

    public Persona(){

    }

}
