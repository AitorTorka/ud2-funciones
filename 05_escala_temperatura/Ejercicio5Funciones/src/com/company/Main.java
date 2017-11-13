package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static double convertirTemperatura( double temperatura, char escala) {

        double resultado=0;
        switch (escala) {
            case '1':
                resultado = temperatura * 1.8 + 32;
                break;
            case '2':
                resultado = temperatura + 273.15;
                break;
            default:
                System.out.println("ERROR");
                break;
        }
        return resultado;

    }

    public static void main(String[] args) throws IOException {
    /* Modifica la función convertirTemperatura() para que haga conversiones de grados centígrados a grados
    Fahrenheit o Kelvin, dependiendo del valor del parámetro escala.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Leer los datos

        System.out.print("Temperatura en ºC: ");
        double a = Double.parseDouble(br.readLine());

        System.out.print("=== Temperaturas ===\n" +
                "1. Convertir a Fahrenheit\n" +
                "2. Convertir a Kelvin\n" +
                "3. Salir\n" +
                "Opción: ");
        char b = br.readLine().charAt(0);

        switch (b) {
            case '1':
                System.out.format(+b + " ºC equivalen a " + convertirTemperatura(a, b) + " ºF");
                break;
            case '2':
                System.out.format(+b + " ºC equivalen a " + convertirTemperatura(a, b) + " K");
                break;
            case '3':
                System.out.println("Fin del programa");
            default:
                System.out.println("ERROR");
                break;
        }

    }
}
