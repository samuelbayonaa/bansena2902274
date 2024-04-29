package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class ReglasdeNegocio extends Habilitante{

    private String descripcion;
    private LocalDate fechaInicio;

    public ReglasdeNegocio(Double valor, String descripcion, LocalDate fechaInicio) {
        super(valor);
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    

    
}
