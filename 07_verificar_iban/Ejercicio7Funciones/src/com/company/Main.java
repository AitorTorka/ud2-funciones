package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    	/* Crea y pon a prueba una función que verifique la validez del IBAN de una cuenta bancaria,
       como por ejemplo ES98 2038 5778 9830 0076 0236.*/

    public static boolean esValido(String IBAN) {

        //Quitar espacios CON .replaceAll("\\s+","").
        IBAN = IBAN.replaceAll("\\s+", "");

        //Extraer Los 4 primeros caracteres.
        String cuatroprimeros = IBAN.substring(0,4);
        String restocadena = IBAN.substring(4);

        //Convertir las letras a numeros usando tabla.

        int numero1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                .indexOf(cuatroprimeros.charAt(0))+10;
        int numero2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                .indexOf(cuatroprimeros.charAt(1))+10;

        //Mostrar el string final
        String nuevoIBAN = restocadena+numero1+numero2+cuatroprimeros.substring(2);

        //Hacer la división y comprobar.

        long numero = Long.parseLong(nuevoIBAN);

        return numero % 97 == 1;
    }


    public static void main(String[] args) throws IOException {
        System.out.println("BE88 3200 3471 3441");

        if (esValido("BE88 3200 3471 3441")) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }


    }
}
