package com.pr.dinet.dao;

import com.pr.dinet.entities.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PersonaDao extends CrudRepository<Persona, UUID> {
}
