package com.ApiRest.Service;


import com.ApiRest.DTO.PersonaDTO;
import com.ApiRest.Entity.Persona;
import com.ApiRest.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public List<Persona> listarPersonas() {

        return personaRepository.findAll();

    }

    public Persona crearPersona(Persona persona) {

        return personaRepository.save(persona);
    }

    public void borrarPersona(Long id) {

        personaRepository.deleteById(id);
    }

    public Persona buscarPersonaPorId(Long id) {

        return personaRepository.findById(id).orElse(null);
    }

    public void modificarPersona(Persona persona) {

        personaRepository.save(persona);
    }
    public PersonaDTO login(String user, String password){
        Persona persona =  personaRepository.findByUserAndPassword(user, password);

        return new PersonaDTO(persona.getId(), persona.getUbication(), persona.getPosition(), persona.getFull_name(), persona.getImage());
    }
}
