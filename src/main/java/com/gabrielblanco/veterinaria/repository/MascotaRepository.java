package com.gabrielblanco.veterinaria.repository;

import java.util.ArrayList;

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

    public void eliminar (String id) { 
    
        for (Mascota mascota : mascotas) {
            if (id.equals(mascota.getId())){
                mascotas.remove(mascota);
            } 
        }    
    }
}

/*

Luego implementa, uno por uno, estos métodos:
guardar(Mascota mascota)

buscarPorId(String id)

buscarTodas()

eliminar(String id)

actualizar(Mascota mascota)

Pero no hagas los cinco de una vez.

Haz primero guardar() y me lo muestras.

Quiero revisar cómo razonas:

¿Dónde verificas si el ID ya existe?
¿El Repository o el Service?
¿Qué devuelve el método?
¿Qué pasa si intentan guardar una mascota repetida?

Esas decisiones son más importantes que la sintaxis.
*/