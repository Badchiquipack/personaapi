package com.marriaga.personaapi.service;

import com.marriaga.personaapi.model.Persona;

import java.util.List;

public interface IPersonaService {

    void guardarPersona(Persona persona);

    List<Persona> obtenerPersonas();

    Persona obtenerPorId(Long id);

    void eliminarPersona(Long id);

    Persona editarPersona(Long id, Persona persona);
}
