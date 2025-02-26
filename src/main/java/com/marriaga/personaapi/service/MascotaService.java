package com.marriaga.personaapi.service;

import com.marriaga.personaapi.model.Mascota;
import com.marriaga.personaapi.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    IMascotaRepository mascotaRepository;

    @Override
    public void guardarMascota(Mascota mascota) {
        mascotaRepository.save(mascota);
    }
}
