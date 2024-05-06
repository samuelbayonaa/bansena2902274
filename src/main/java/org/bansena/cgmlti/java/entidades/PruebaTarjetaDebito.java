package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class PruebaTarjetaDebito {
    public static void main(String[] args) {
        //
        Campania c = new Campania(
            LocalDate.now(), 
            LocalDate.of(2024, 8, 6), 
            500.0, 
            "ADSO"
        );

        //crear cuota de manejo
        CuotaManejo<Campania> cm = new CuotaManejo<Campania>(c);

        //asignar la cuota de manejo a una tarjeta de debito
        TarjetaDebito<Campania> t1 = new TarjetaDebito<>(
            224324L,
            LocalDate.now(), 
            1000000.0
        );

        t1.setCuotaManejo(cm);
        
        //Crear cuenta bancaria

        CuentaBancaria cb1 = new CuentaBancaria<>(
            9990L, 
            1000000.0, 
            "Cop", 
            t1
        );

        //Vincular cuenta bancaria a la cuota de manejos

        cb1.lManejos.add(cb1);

        System.out.println(cm + "," + cb1);
    }
}
