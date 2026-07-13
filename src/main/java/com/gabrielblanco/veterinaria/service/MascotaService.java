package com.gabrielblanco.veterinaria.service;

import com.gabrielblanco.veterinaria.model.Mascota;
import com.gabrielblanco.veterinaria.repository.MascotaRepository;
public class MascotaService {
    private MascotaRepository repository;

    public MascotaService(MascotaRepository repository) {
        this.repository = repository;
    }
    
    public void registrarMascota(Mascota mascota) {
        if (mascota == null) {
            throw new IllegalArgumentException(
                "La mascota no puede ser null."
            );
        }
        var res = repository.buscarPorId(mascota.getId());
        if (res != null) {
            throw new IllegalArgumentException("El id ya existe para esta Mascota.");
        }
        repository.guardar(mascota);
    }

}
