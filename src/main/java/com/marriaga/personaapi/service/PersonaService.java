package com.marriaga.personaapi.service;

import com.marriaga.personaapi.model.Persona;
import com.marriaga.personaapi.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    IPersonaRepository personaRepository;

    @Override
    public void guardarPersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public List<Persona> obtenerPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona editarPersona(Long id, Persona persona) {
        Persona perso = this.obtenerPorId(id);
        if(persona.getNombre()!=null){
            perso.setNombre(persona.getNombre());
        }
        if (persona.getApellido()!=null){
            perso.setApellido(persona.getApellido());
        }
        if (persona.getEdad()!=null){
            perso.setEdad(persona.getEdad());
        }
        if (persona.getMascota()!=null){
            perso.setMascota(persona.getMascota());
        }
        personaRepository.save(perso);
        return this.obtenerPorId(perso.getId());
    }
}
