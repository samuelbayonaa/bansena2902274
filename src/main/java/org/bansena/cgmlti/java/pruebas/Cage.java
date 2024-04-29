package org.bansena.cgmlti.java.pruebas;

//<E>: es un tipo de dato generico
//pueder ser cualquier tipo de objeto
public class Cage<E extends IComportamientoAnimal> {

    //Una jaula puede tener dos mascotas
    //las mascotas pueden ser del tipo que sena
    //pero ambas deben ser del mismo tipo
    //por que si no se pueden agredir

    private E mascota1;
    private E mascota2;
    
    public E getMascota1() {
        return mascota1;
    }
    public void setMascota1(E mascota1) {
        this.mascota1 = mascota1;
    }
    public E getMascota2() {
        return mascota2;
    }
    public void setMascota2(E mascota2) {
        this.mascota2 = mascota2;
    }

    //comportamiento para alimentar animales 
    public void alimentarMascota(){
        this.mascota1.alimentarse("purina");
    }

    
}
