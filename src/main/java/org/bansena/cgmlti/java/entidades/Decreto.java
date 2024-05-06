package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class Decreto extends Habilitante{

    private Long numero;
    private LocalDate año;

    public Decreto(LocalDate fechainicio, LocalDate fechafin, double valor, Long numero, LocalDate año) {
        super(fechainicio, fechafin, valor);
        this.numero = numero;
        this.año = año;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public LocalDate getAño() {
        return año;
    }

    public void setAño(LocalDate año) {
        this.año = año;
    }

    

}
