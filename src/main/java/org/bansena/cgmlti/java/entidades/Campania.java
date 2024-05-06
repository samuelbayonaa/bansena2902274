package org.bansena.cgmlti.java.entidades;
import java.time.LocalDate;

public class Campania extends Habilitante {
    
    private String nombre;

    public Campania(LocalDate fechainicio, LocalDate fechafin, double valor, String nombre) {
        super(fechainicio, fechafin, valor);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + " ";
    }


}
