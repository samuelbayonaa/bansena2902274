package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class ReglasdeNegocio extends Habilitante{

    private String descripcion;

    public ReglasdeNegocio(LocalDate fechainicio, LocalDate fechafin, double valor, String descripcion,
            LocalDate fechaInicio2) {
        super(fechainicio, fechafin, valor);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

 
}
