package org.bansena.cgmlti.java.pruebas;

public class PruebaJaulas {

    public static void main(String[] args) {
        //primera jaula solo va a albergar
        //perros:
        Dog perro1 = new Dog();
        Dog perro2 = new Dog();
        Cat gatico1 = new Cat();


        Cage<Dog> jaula1 = new Cage<Dog>();
        jaula1.setMascota1(perro1);
        jaula1.setMascota2(perro2);
        jaula1.alimentarMascota();

        Cage<Cat> jaulaGatos = new Cage<Cat>();
        jaulaGatos.setMascota1(gatico1);
        jaulaGatos.alimentarMascota();

    }

}
