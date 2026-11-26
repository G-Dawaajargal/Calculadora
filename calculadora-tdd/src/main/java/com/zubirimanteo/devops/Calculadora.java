package com.zubirimanteo.devops;

import java.util.Scanner;

public class Calculadora {

    public int suma(int a, int b) {
        return a + b;
    }
    public int resta(int a, int b){
        return a-b;
    }
    public int multipilicacion(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int opcion;
        int a;
        int b;
        int resultado;
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.print("Selecciona una operación: ");
        opcion = teclado.nextInt();
        System.out.print("Introduce el primer número: ");
        a = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        b = teclado.nextInt();
        switch (opcion) {
            case 1:
                resultado = calculadora.suma(a, b);
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = calculadora.resta(a, b);
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = calculadora.multipilicacion(a, b);
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        teclado.close();

        System.out.print("Cambio");
    }
}
