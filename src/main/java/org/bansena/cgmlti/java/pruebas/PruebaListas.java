package org.bansena.cgmlti.java.pruebas;

import java.util.ArrayList;
import java.util.List;

public class PruebaListas {
    public static void main(String[] args) {
        
    
    List<Integer> lEnteros = new ArrayList<Integer>();    

    //metodos add de la lista raw 
    
    lEnteros.add(2);
    lEnteros.add(5);
    lEnteros.add(50);
    lEnteros.add(45);
    lEnteros.add(4);

    //metodos get(indice)
    //System.out.println(lEnteros.get(1));
    
    //recorrer lista
    for( Object n : lEnteros  ){

        Integer numero = (Integer) n;
        System.out.println(numero);

    }

}   
}