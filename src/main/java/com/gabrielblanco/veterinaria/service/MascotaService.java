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

    private void validarMascotaExiste(String id) {
        if (obtenerMascota(id) == null) {
            throw new IllegalArgumentException(
                "La mascota no puede ser null."
            );
        } 
    }

    private void validarMascotaNoExiste(String id) {
        if (obtenerMascota(id) != null) {
            throw new IllegalArgumentException(
                "Error"
            );
        } 
    }

    public Mascota buscarMascotaPorId(String id) {
        validarId(id);
        validarMascotaExiste(id);
        Mascota mascota = obtenerMascota(id);
        return mascota;
    }
    
    public void registrarMascota(Mascota mascota) {
        validarMascotaExiste(mascota.getId());
        repository.guardar(mascota);
    }

    public void actualizarMascota(Mascota mascota) {
        validarMascotaNoExiste(mascota.getId());
        repository.actualizar(mascota);
    }

    public void eliminarMascota(String id) {
        validarId(id);
        validarMascotaNoExiste(id);
        repository.eliminar(id);
    }
}
