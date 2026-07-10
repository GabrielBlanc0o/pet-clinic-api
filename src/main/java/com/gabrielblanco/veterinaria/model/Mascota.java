package com.gabrielblanco.veterinaria.model;

import java.time.LocalDate;
import java.time.Period;


public class Mascota {
    public enum EstadoMascota {
        ACTIVA,
        ADOPCION,
        FALLECIDA
    }

    private String id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private Double peso;
    private EstadoMascota estado;


    private void nombreVerificacion(String nombre) {
        if ( nombre == null || nombre.length() < 3 || nombre.isBlank() ) {
            throw new IllegalArgumentException("Ingrese un nombre mayor a 3 caracteres.");
        }
    }

    private void validarEstado(EstadoMascota estado){

    if(estado == null){
        throw new IllegalArgumentException("Debe indicar un estado.");
    }

    }
    private void pesoVerificacion(Double peso) {
        if (peso == null || peso <= 0.0) {
            throw new IllegalArgumentException("El peso no puede ser 0 o menor a 0.");
        }
    }

    private void validarFechaNacimiento(LocalDate fechaNacimiento) {
        
        LocalDate fechaActual = LocalDate.now();
        //IMPORTANTE para sacar los años de un String luego de su Parse !!
        int edadFormat = Period.between(fechaNacimiento, fechaActual).getYears();
        if (edadFormat <= 0) {
            throw new IllegalArgumentException("La edad no puede ser 0 menor a 0.");
        }   
    }

    public Mascota(){}
    public Mascota(String id , String nombre, Double peso , LocalDate fechaNacimiento , EstadoMascota estado) {
        nombreVerificacion(nombre);
        pesoVerificacion(peso);
        validarFechaNacimiento(fechaNacimiento);
        validarEstado(estado);
        this.id = id ;
        this.nombre = nombre;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }


    public void setNombre(String nombre) {
        nombreVerificacion(nombre);
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPeso(Double peso) {
        pesoVerificacion(peso);
        this.peso = peso;
    }
    public Double getPeso() {
        return peso;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        validarFechaNacimiento(fechaNacimiento);
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setEstado(EstadoMascota estado) {
        this.estado = estado;
    }
    public EstadoMascota getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return id.concat(" Nombre: " + getNombre() + "\n"
                        +" Peso: " + getPeso() + "\n"
                        +" Fecha nacimiento: " + getFechaNacimiento() + "\n"
                        + "Estado actual: " + getEstado()  );
    }

}
