package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static double convertirTemperatura(double resultado, double temperatura, char escala) {

        switch (escala) {
            case '1':
                resultado = temperatura * 1.8 + 32;
                break;
            case '2':
                resultado = temperatura + 273.15;
                break;
            default:
        }
        return resultado;
    }

    public static void main(String[] args) throws IOException {
    /* Visualiza los grados Fahrenheit que corresponden a los grados centígrados que recibas como dato de entrada.
       Usa para ello la función convertirTemperatura().*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Leer los datos

        double a = 0;

        System.out.print("Temperatura en ºC: ");
        double b = Double.parseDouble(br.readLine());

        System.out.print("=== Temperaturas ===\n" +
                "1. Convertir a Fahrenheit\n" +
                "2. Convertir a Kelvin\n" +
                "3. Salir\n" +
                "Opción: ");
        char c = br.readLine().charAt(0);

        switch (c) {
            case '1':
                System.out.format(+b + " ºC equivalen a " + convertirTemperatura(a, b, c) + " ºF");
                break;
            case '2':
                System.out.format(+b + " ºC equivalen a " + convertirTemperatura(a, b, c) + " K");
                break;
            case '3':
                System.out.println("Fin del programa");
            default:
        }

    }
}
