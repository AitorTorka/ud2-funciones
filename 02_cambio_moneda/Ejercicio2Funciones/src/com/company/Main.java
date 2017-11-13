package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static double calcularCambio(double euros, String divisa) {

        double cambio = 0;

        switch (divisa) {

            case "usd":
                cambio = euros * 1.16;
                break;
            case "gbp":
                cambio = euros * 0.88;
                break;
            case "cny":
                cambio = euros * 7.70;
                break;
            case "jpy":
                cambio = euros * 132.54;
                break;
            default:
                System.out.println("ERROR: Moneda incorrecta... ");
                break;
        }

        return cambio;
    }


    public static void main(String[] args) throws IOException {
    /* Introduce por teclado una cantidad en euros y muestra en pantalla esa cantidad en dolares,
       libras, yuanes y yenes.

       Usa para ello la función calcularCambio() que recibe, además del valor a convertir,
       la moneda a la que queremos convertirlo expresada según el estándar ISO 4217. */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce la cantidad de euros: ");
        double a = Double.parseDouble(br.readLine());

        System.out.println("Introduce divisa a la que deseas convertir: USD, GBP, CNY, JPY ");
        String b = br.readLine().toLowerCase();

        switch (b) {

            case "usd":
                System.out.println("--- " + a + " euros son " + calcularCambio(a, b) + " usd ---");
                break;
            case "gbp":
                System.out.println("--- " + a + " euros son " + calcularCambio(a, b) + " gbp ---");
                break;
            case "cny":
                System.out.println("--- " + a + " euros son " + calcularCambio(a, b) + " cny ---");
                break;
            case "jpy":
                System.out.println("--- " + a + " euros son " + calcularCambio(a, b) + " jpy ---");
                break;
            default:
                System.out.println("ERROR: Moneda incorrecta... ");
                break;

        }
    }
}
