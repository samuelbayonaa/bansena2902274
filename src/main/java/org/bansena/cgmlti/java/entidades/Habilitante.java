package org.bansena.cgmlti.java.entidades;
import java.time.LocalDate;

public abstract class Habilitante {

    //@todo:poner los atributos de fecha inicio y fecha fin poner getters y setters a feche de inicio y fin
    protected LocalDate fechainicio;
    protected LocalDate fechafin;
    protected double valor;

    public Habilitante(LocalDate fechainicio, LocalDate fechafin, double valor) {
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.valor = valor;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
