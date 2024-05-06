package org.bansena.cgmlti.java.entidades;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria <T extends Habilitante> {

    private Long numero;
    private Double saldo;
    private String divisa;

    private TarjetaDebito<T> tarjetaDebito;

    List<CuotaManejo>lManejos = new ArrayList<>();

    public CuentaBancaria(Long numero, Double saldo, String divisa, TarjetaDebito<T> tarjetaDebito) {
        this.numero = numero;
        this.saldo = saldo;
        this.divisa = divisa;
        this.tarjetaDebito = tarjetaDebito;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    public TarjetaDebito<T> getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(TarjetaDebito<T> tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    


}
