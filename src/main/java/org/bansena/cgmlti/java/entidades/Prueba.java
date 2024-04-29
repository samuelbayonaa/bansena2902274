package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class Prueba {

    public static void main(String[] args) {
        

        //Crear campaña 
        Campania ca = new Campania(
            500.0,
            "Dia de la madre",
            LocalDate.of(2024, 05, 12),
            LocalDate.of(2024, 05, 30)
        );       
        //Crear una couta de manejo 
        //Especifica para campañas
        CuotaManejo<Campania> cm1 = new CuotaManejo<Campania>(
            ca.getFechaInicio(), 
            ca.getFechaFin(), 
            ca.getValor(), 
            ca
        );
        //Crear una Cuenta Bancaria:
        CuentaBancaria cuentica = new CuentaBancaria(
            234L, 
            12.000,
            "COP"
        );
        //Vincular la couta de manejo a 
        //la cuenta bancaria
        cuentica.lManejos.add(cm1);
    }
}
