package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class Campania extends Habilitante {
    
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    
    public Campania(Double valor, String nombre, LocalDate fechaInicio, LocalDate fechaFin) {
        super(valor);
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }


    
}
