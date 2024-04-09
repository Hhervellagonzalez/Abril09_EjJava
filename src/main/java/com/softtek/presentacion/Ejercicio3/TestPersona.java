package com.softtek.presentacion.Ejercicio3;

import com.softtek.modelo.Ejercicio3.EstadoCivil;
import com.softtek.modelo.Ejercicio3.Persona;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("pepe", 18, EstadoCivil.SOLTERO);
        Persona persona2 = new Persona("charlie", 24, EstadoCivil.CASADO);
        Persona persona3 = new Persona("Juan", 65, EstadoCivil.VIUDO);

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

        System.out.println(persona1.equals(persona2));
    }
}
