package com.gabrielblanco.veterinaria.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielblanco.veterinaria.model.Mascota;
import com.gabrielblanco.veterinaria.service.MascotaService;

@RestController
public class MascotaController {
    private final MascotaService service;

    public MascotaController(MascotaService service) {
        this.service = service;
    }

    @GetMapping("/mascotas")
    public List<Mascota> obtenerTodas() {
        return service.obtenerTodas();
    }
}
