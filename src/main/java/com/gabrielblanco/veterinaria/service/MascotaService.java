package com.gabrielblanco.veterinaria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gabrielblanco.veterinaria.model.Mascota;
import com.gabrielblanco.veterinaria.repository.MascotaRepository;
@Service
public class MascotaService {
    private MascotaRepository repository;

    public MascotaService(MascotaRepository repository) {
        this.repository = repository;
    }

    private Mascota obtenerMascota(String id) {
        return repository.buscarPorId(id);
    }

    public List<Mascota> obtenerTodas() {
        return repository.obtenerTodas();
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
                "Ya existe una mascota con el id: " + id
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
        validarMascotaNoExiste(mascota.getId());
        repository.guardar(mascota);
    }

    public void actualizarMascota(Mascota mascota) {
        validarMascotaExiste(mascota.getId());
        repository.actualizar(mascota);
    }

    public void eliminarMascota(String id) {
        validarId(id);
        validarMascotaExiste(id);
        repository.eliminar(id);
    }
}

/*ejm 
Fabrica fabrica = new Fabrica();

MascotaService mascota = fabrica.crearMascotaService();
ClienteService cliente = fabrica.crearClienteService();
ProductoService producto = fabrica.crearProductoService();
 */ 