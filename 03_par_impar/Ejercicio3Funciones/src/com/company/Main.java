package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean esPar(int numero) {

        if (numero % 2 == 0)
            return true;
        else
            return false;
    }
    //return numero % 2 == 0;

    public static boolean esImpar(int numero) {

        if (numero % 2 != 0)
            return true;
        else
            return false;
    }
    /*  return numero % 2 != 0;
        return !esPar(n);*/


    public static void main(String[] args) throws IOException {
        // Escribe las funciones esPar() y esImpar() que nos digan si un número es par o impar respectivamente.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce un numero: ");
        int a = Integer.parseInt(br.readLine());

        if (esPar(a)) {
            System.out.print("El Numero es par (" + esPar(a) + ")");
        }

        if (esImpar(a)) {
            System.out.print("El Numero es impar (" + esImpar(a) + ")");
        }
    }
}