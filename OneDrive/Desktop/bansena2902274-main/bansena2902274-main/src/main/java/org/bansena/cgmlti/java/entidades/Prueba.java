package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prueba {

    public static void main(String[] args) {
        
        //Crear campaña 
        Campania ca = new Campania(
            500.0,
            "Dia de la madre",
            LocalDate.of(2024, 05, 12),
            LocalDate.of(2024, 05, 30)
        );      

        //Crear una couta de manejo especifica para campañas
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

        //Vincular la couta de manejo a la cuenta bancaria
        cuentica.lManejos.add(cm1);

//////////////////////////////////////////////////////////////////////
        //Crear Reglas de Negocio
        ReglasdeNegocio re = new ReglasdeNegocio(
            4.000,
            "...", 
            LocalDate.of(2024, 05, 01)
        );

        //Crear una cuota de manejo, Especifica para las reglas de negocio
        CuotaManejo<ReglasdeNegocio> rm1 = new CuotaManejo<ReglasdeNegocio>(
            re.getFechaInicio(), 
            LocalDate.of(2024, 05, 10), 
            re.getValor(), 
            re
        );

        //Crear una cuenta bancaria 
        CuentaBancaria cuentica2 = new CuentaBancaria(
            567L,
            30.000,
            "COP"
        );

        //vincular la cuota de manejo a la cuenta bancaria
        cuentica2.lManejos.add(rm1);
//////////////////////////////////////////////////////////////////////
        //Crear Decreto
        Decreto de = new Decreto(
            100.0,
            890L, 
            LocalDate.of(2024, 1, 1)
        );

        //Crear una cuota de manejo especifica para decretos
        CuotaManejo<Decreto> d1 = new CuotaManejo<Decreto>(
            LocalDate.of(2024, 01, 01),
            LocalDate.of(2024, 12, 31),
            2000.0,
            de
        );

        //Crear una cuenta Bancaria:
        CuentaBancaria cuentica3 = new CuentaBancaria(
            012L,
            25.000,
            "COP"
        );

        //Vincula la cuota de manejoa a la cuenta bancaria 
        cuentica3.lManejos.add(d1);
    }


}
