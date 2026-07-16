package com.gabrielblanco.veterinaria.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gabrielblanco.veterinaria.model.Mascota;

@Repository
public class MascotaRepository {

    private List<Mascota> mascotas;

    public MascotaRepository() {
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota(
            "M001",
             "Coco",
              4.0,
               LocalDate.of(2023, 5, 10),
                Mascota.EstadoMascota.ACTIVA
            ));
        mascotas.add(new Mascota(
        "M002",
            "Luna",
            4.8,
            LocalDate.of(2010, 5, 10),
            Mascota.EstadoMascota.ACTIVA
        ));
    }

    public void guardar(Mascota mascota) {
        if (buscarPorId(mascota.getId()) != null) {
            throw new IllegalArgumentException("Ya existe una mascota con ese id.");
        }
        mascotas.add(mascota);
    }
    
    public List<Mascota> obtenerTodas() {
        return new ArrayList<>(mascotas);
    }

    public Mascota buscarPorId (String id) {
        for (Mascota mascota : mascotas) {
            if (id.equals(mascota.getId())){
                return mascota;
            } 
        }
        return null;
    }

    public void eliminar(String id) { 
        mascotas.removeIf(mascota -> mascota.getId().equals(id));
    }

    public void actualizar(Mascota mascota) {
        var res = buscarPorId(mascota.getId());
        if (res == null) {
            return;
        } 
            res.setNombre(mascota.getNombre());
            res.setPeso(mascota.getPeso());
            res.setFechaNacimiento(mascota.getFechaNacimiento());
            res.setEstado(mascota.getEstado());
        }
} 

    


