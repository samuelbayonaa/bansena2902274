package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prueba {

    public static void main(String[] args) {
        
        //Crear campaña 
        Campania ca = new Campania(null, null, 0, null);     

        //Crear una couta de manejo especifica para campañas
        CuotaManejo<Campania> cm1 = new CuotaManejo<Campania>(ca);

        //Crear una Cuenta Bancaria:
        CuentaBancaria cuentica = new CuentaBancaria<>(123213L, 312312.1, "COP", null);

        //Vincular la couta de manejo a la cuenta bancaria
        cuentica.lManejos.add(cm1);

//////////////////////////////////////////////////////////////////////

        //Crear Reglas de Negocio
        ReglasdeNegocio re = new ReglasdeNegocio(null, null, 0, null, null);
        //Crear una cuota de manejo, Especifica para las reglas de negocio
        CuotaManejo<ReglasdeNegocio> rm1 = new CuotaManejo<ReglasdeNegocio>(re);

        //Crear una cuenta bancaria 
        CuentaBancaria cuentica2 = new CuentaBancaria<>(null, null, null, null);

        //vincular la cuota de manejo a la cuenta bancaria
        cuentica2.lManejos.add(rm1);

//////////////////////////////////////////////////////////////////////

        //Crear Decreto
        Decreto de = new Decreto(null, null, 0, null, null);
        //Crear una cuota de manejo especifica para decretos
        CuotaManejo<Decreto> d1 = new CuotaManejo<Decreto>(de);

        //Crear una cuenta Bancaria:
        CuentaBancaria cuentica3 = new CuentaBancaria<>(null, null, null, null);

        //Vincula la cuota de manejo a la cuenta bancaria 
        cuentica3.lManejos.add(d1);
    }


}
