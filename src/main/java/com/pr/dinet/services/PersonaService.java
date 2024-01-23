package com.pr.dinet.services;

import com.pr.dinet.dao.PersonaDao;
import com.pr.dinet.entities.Persona;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaService {
    private final PersonaDao personaDao;

    public PersonaService(PersonaDao personaDao) {
        this.personaDao = personaDao;
    }

    @Transactional
    public void fillData(){
        Persona persona = Persona.builder()
                .nombre("Nombre1")
                .apellido("Apellido1")
                .telefono("Telefono1")
                .build();

        System.out.println(persona.toString());

    }
}
