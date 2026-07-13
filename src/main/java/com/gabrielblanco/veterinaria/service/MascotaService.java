package com.gabrielblanco.veterinaria.service;

import com.gabrielblanco.veterinaria.model.Mascota;
import com.gabrielblanco.veterinaria.repository.MascotaRepository;
public class MascotaService {
    private MascotaRepository repository;

    public MascotaService(MascotaRepository repository) {
        this.repository = repository;
    }

    private Mascota obtenerMascota(String id) {
        return repository.buscarPorId(id);
    }

    private void validarId(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException(
                "El id no puede estar vacío."
            );
        }
    }

    private void validarMascota(Mascota mascota) {
        if (mascota == null) {
            throw new IllegalArgumentException(
                "La mascota no puede ser null."
            );
        } else {
            System.out.println("La mascota con id " + mascota.getId() + " si existe.");
        }
    }
    public Mascota buscarMascotaPorId(String id) {

        validarId(id);
        Mascota mascota = obtenerMascota(id);
        validarMascota(mascota);
        return mascota;
    }
    
    public void registrarMascota(Mascota mascota) {
        
        Mascota verificar = obtenerMascota(mascota.getId());
        validarMascota(verificar);
        repository.guardar(mascota);
    }

    public void actualizarMascota(Mascota mascota) {
        validarMascota(mascota);
        Mascota verificar = obtenerMascota(mascota.getId());
        if (verificar != null) {
            repository.actualizar(mascota);
        } else {
            throw new IllegalArgumentException(
                "No existe una mascota con el id: " + mascota.getId()
            );
        }
    }

    public void eliminarMascota(String id) {
        validarId(id);
        Mascota verificar = obtenerMascota(id);
        validarMascota(verificar);
        repository.eliminar(id);
    }
}
