package com.marriaga.personaapi.controller;

import com.marriaga.personaapi.model.Mascota;
import com.marriaga.personaapi.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mascota")
public class MascotaController {

    @Autowired
    IMascotaService mascotaService;

    @PostMapping("/guardar")
    public ResponseEntity guardarMascota(@RequestBody Mascota mascota){
        mascotaService.guardarMascota(mascota);
        return ResponseEntity.ok("Mascota agregada correctamente!");
    }
}
