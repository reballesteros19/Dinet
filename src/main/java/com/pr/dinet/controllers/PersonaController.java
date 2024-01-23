package com.pr.dinet.controllers;

import com.pr.dinet.entities.Persona;
import com.pr.dinet.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    private final PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/fillData")
    public ResponseEntity<String> fillData() {
        try {
            personaService.fillData();
            return new ResponseEntity<>("Data filled successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error filling data: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}