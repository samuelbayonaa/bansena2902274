package org.bansena.cgmlti.java.pruebas;

public class PruebasMetodosGenericos {

    //metodo generico
    //metodo que acepta parametros
    //ajustables a cualquier tipo de datos
    static <T> T mostrarELemento(T item){

        return item;
    }


    public static void main(String[] args) {
    
    //invocar el metodo mostrarElemento
    
    System.out.println(mostrarELemento("SML")
    );
        
    }
}
