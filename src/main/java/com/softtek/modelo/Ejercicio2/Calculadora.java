package com.softtek.modelo.Ejercicio2;

public class Calculadora {
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static double dividir(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
        }
        return (double) num1 / num2;
    }
}