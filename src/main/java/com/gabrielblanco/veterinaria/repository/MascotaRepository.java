package com.gabrielblanco.veterinaria.repository;

import java.util.ArrayList;
import java.util.List;

import com.gabrielblanco.veterinaria.model.Mascota;

public class MascotaRepository {

    private ArrayList<Mascota> mascotas;

    public MascotaRepository() {
        mascotas = new ArrayList<>();
    }

    public void guardar (Mascota mascota) {
       mascotas.add(mascota);
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

    public List<Mascota> buscarTodas() {
        return new ArrayList<>(mascotas);
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

    


