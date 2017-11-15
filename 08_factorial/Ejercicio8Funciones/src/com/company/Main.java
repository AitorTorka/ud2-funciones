package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int factorialrepetitiva(int numero) {

        int t = 1;
        for (int i = 1; i <= numero; i++) {
            t = t * i;
        }
        return t;
    }

    public static int factorialrecursivo(int numero) {

        if (numero > 0)
            return numero * factorialrecursivo(numero - 1);
        else
            return 1;
    }

    public static void main(String[] args) throws IOException {
        /* Escribe una función que calcule el factorial de un número.
         Nota: Haz una versión repetitiva y otra recursiva*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        char option;
        System.out.println("=== Elige Factorial repetitivo o recursivo ===\n" +
                "a) Repetivivo\n" +
                "b) Recursivo\n" +
                "c) Salir\n" +
                "Opción:");

        option = br.readLine().toLowerCase().charAt(0);

        switch (option) {
            case 'a':
                System.out.println("Introduce el valor: ");
                int a = Integer.parseInt(br.readLine());
                System.out.println("El factorial Repetivivo es: " + factorialrepetitiva(a));
                break;
            case 'b':
                System.out.println("Introduce el valor: ");
                int b = Integer.parseInt(br.readLine());
                System.out.println("El factorial Recursivo es: " + factorialrecursivo(b));
                break;

            case 'c':
                System.out.println("Fin del programa");
                break;

            default:
                System.out.println("ERROR");
                break;

        }
        System.out.println("Introduce un numero para calcular su factorial: ");
        int a = Integer.parseInt(br.readLine());

        System.out.println("El factorial es : " + factorialrepetitiva(a));
    }
}
