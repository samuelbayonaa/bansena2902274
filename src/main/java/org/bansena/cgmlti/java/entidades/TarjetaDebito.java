package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class TarjetaDebito<T extends Habilitante> {

    private Long numeroTarjeta;
    private LocalDate fechaVencimiento;
    private Double tope;
    //cuota de manejo
    private CuotaManejo<T> cuotaManejo;

    public TarjetaDebito(Long numeroTarjeta, LocalDate fechaVencimiento, Double tope) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.tope = tope;
    }

    public Long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Double getTope() {
        return tope;
    }

    public void setTope(Double tope) {
        this.tope = tope;
    }

    public void setCuotaManejo(CuotaManejo<T> cuotaManejo) {
        this.cuotaManejo = cuotaManejo;
    }

    @Override
    public String toString() {
        return "Numero de Tarjeta: " + numeroTarjeta + ", fecha de Vencimiento: " + fechaVencimiento + ", tope: "
                + tope;
    }

    
    



}
