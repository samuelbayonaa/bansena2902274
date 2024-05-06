package org.bansena.cgmlti.java.entidades;

public class CuentaAhorros extends CuentaBancaria{

    public CuentaAhorros(Long numero, Double saldo, String divisa, TarjetaDebito tarjetaDebito) {
        super(numero, saldo, divisa, tarjetaDebito);
    }

}
