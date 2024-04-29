package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class Decreto extends Habilitante{

    private String numero;
    private LocalDate año;

    public Decreto(Double valor, String numero, LocalDate año) {
        super(valor);
        this.numero = numero;
        this.año = año;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getAño() {
        return año;
    }

    public void setAño(LocalDate año) {
        this.año = año;
    }

    
    
    
}
