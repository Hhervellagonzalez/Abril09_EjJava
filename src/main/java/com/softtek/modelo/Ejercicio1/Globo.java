package com.softtek.modelo.Ejercicio1;

public class Globo {
    private static int numId = 0;
    private int id;

    public Globo() {
        this.id = ++numId;
    }

    public void mostrarId() {
        System.out.println("ID del Globo: " + id);
    }

    public static int getContadorId() {
        return numId;
    }
}
