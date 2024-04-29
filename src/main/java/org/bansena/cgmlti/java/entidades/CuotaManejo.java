package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class CuotaManejo<E> {

    private LocalDate fechainicio;
    private LocalDate fechaFin;
    private Double valor;
    private E Habilitante;

    public CuotaManejo(LocalDate fechainicio, LocalDate fechaFin, Double valor, E habilitante) {
        this.fechainicio = fechainicio;
        this.fechaFin = fechaFin;
        this.valor = valor;
        this.Habilitante = habilitante;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public E getHabilitante() {
        return Habilitante;
    }

    public void setHabilitante(E habilitante) {
        this.Habilitante = habilitante;
    }

    
}
