package com.softtek.modelo.Ejercicio3;

public class Persona {
    private String nombre;
    private int edad;
    private EstadoCivil estadoCivil;


    public Persona(String nombre, int edad, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estadoCivil=" + estadoCivil +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        Persona persona = (Persona) o;

        if (edad != persona.edad){
            return false;
        }
        if (!nombre.equals(persona.nombre)){
            return false;
        }
        return estadoCivil == persona.estadoCivil;
    }
}