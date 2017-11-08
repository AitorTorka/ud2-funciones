package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void esPar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        }
    }

    public static void esImpar(int numero) {
        if (numero % 2 != 0) {
            System.out.println("El número es impar");
        }
    }

    public static void main(String[] args) throws IOException {
        // Escribe las funciones esPar() y esImpar() que nos digan si un número es par o impar respectivamente.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce un numero: ");
        int a = Integer.parseInt(br.readLine());

        esImpar(a);
        esPar(a);

    }
}