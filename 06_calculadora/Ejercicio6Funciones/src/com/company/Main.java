package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    /*
    Escribe un programa que muestre al usuario un menú con las siguientes opciones:

=== Calculadora ===
    a) Longitud de la circunferencia
    b) Área del círculo
    c) Volumen de la esfera
    d) Salir
    Opción:

    Cuando el usuario elija una opción válida, el programa pedirá el valor del radio necesario para los
    cálculos y mostrará el resultado de la operación.

    Para hacer las operaciones, escribiremos las funciones longitud(), area() y volumen() que nos
    devolverán los valores necesarios.

    Preguntandole a WolframAlpha podéis encontrar la respuesta a cómo se calculan el perímetro y el área del
    círculo, así como el volumen de la esfera.

    Nota: El programa no termina hasta elegir la opción Salir.
    */

public class Main {


    private static double longitud(double l) {

        double π = 3.14159265359;
        double perimetro = 2 * π * l;

        return perimetro;
    }

    private static double area(double a) {

        double π = 3.14159265359;
        double area = π * (a * a);

        return area;
    }

    private static double volumen(double v) {

        double π = 3.14159265359;
        double volumen = (4 / 3) * π * (v * v * v);

        return volumen;
    }

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char option;

        do {
            System.out.println("=== Calculadora ===\n" +
                    "a) Longitud de la circunferencia\n" +
                    "b) Área del círculo\n" +
                    "c) Volumen de la esfera\n" +
                    "d) Salir\n" +
                    "Opción:");

            option = br.readLine().toLowerCase().charAt(0);

            switch (option) {
                case 'a':
                    System.out.println("Introduce el radio: ");
                    double a = Double.parseDouble(br.readLine());
                    System.out.println("La longitud es: " + longitud(a));
                    break;
                case 'b':
                    System.out.println("Introduce el radio: ");
                    double b = Double.parseDouble(br.readLine());
                    System.out.println("El area es: " + area(b));
                    break;
                case 'c':
                    System.out.println("Introduce el radio: ");
                    double c = Double.parseDouble(br.readLine());
                    System.out.println("El volumen es: " + volumen(c));
                    break;

                case 'd':
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("ERROR");
                    break;

            }
        } while (option != 'd');
    }
}
