package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class CuotaManejo<E extends Habilitante> {

    private LocalDate fechainicio;
    private LocalDate fechaFin;
    private Double valor;
    private E Habilitante;

    public CuotaManejo(E habilitante) {
        this.valor = habilitante.getValor();
        this.fechainicio = habilitante.getFechainicio();
        this.fechaFin = habilitante.getFechafin();
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

    @Override
    public String toString() {
        return "CuotaManejo: fecha de inicio: " + fechainicio + ", fecha de Fin: " + fechaFin + ", valor: " + valor
                + ", Habilitante: " + Habilitante;
    }

    
    
}
