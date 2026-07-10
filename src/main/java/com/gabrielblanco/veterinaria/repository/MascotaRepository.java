package com.gabrielblanco.veterinaria.repository;

import java.util.ArrayList;

import com.gabrielblanco.veterinaria.model.Mascota;

public class MascotaRepository {

    private ArrayList<Mascota> mascotas;

    public MascotaRepository() {
        mascotas = new ArrayList<>();
    }

    public Mascota guardar (Mascota mascota) {
        return mascota;
    }
    
    
    //Mascota mascota1 = new Mascota("101","Firulais",67.5,Mascota(2010,07,05),Mascota.EstadoMascota.ACTIVA);
    
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