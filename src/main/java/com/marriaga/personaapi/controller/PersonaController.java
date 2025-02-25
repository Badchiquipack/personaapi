package com.marriaga.personaapi.controller;

import com.marriaga.personaapi.model.Persona;
import com.marriaga.personaapi.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    IPersonaService service;

    @GetMapping("/todos")
    public ResponseEntity obtenerPersonas() {
        return ResponseEntity.ok(service.obtenerPersonas());
    }

    @GetMapping("/{id}")
    public ResponseEntity obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.obtenerPorId(id));
    }

    @PostMapping("/guardar")
    public ResponseEntity guardarPersona(@RequestBody Persona persona) {
        service.guardarPersona(persona);
        return ResponseEntity.ok("Persona guardada correctamente!");
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity eliminarPersona(@PathVariable Long id) {
        service.eliminarPersona(id);
        return ResponseEntity.ok("Persona eliminada correctamente");
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity editarPersona(@PathVariable Long id,
                                        @RequestBody Persona persona) {
        return ResponseEntity.ok(service.editarPersona(id, persona));
    }

}
