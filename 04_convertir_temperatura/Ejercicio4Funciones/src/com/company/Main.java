package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static double convertirTemperatura(double temperatura){

        double Fahrenheit = temperatura * 1.8 + 32;

        return Fahrenheit;
    }

    public static void main(String[] args) throws IOException {
	/* Visualiza los grados Fahrenheit que corresponden a los grados centígrados que recibas como dato de entrada.
       Usa para ello la función convertirTemperatura().*/

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Introduce los grados ºC: ");

        double a = Double.parseDouble(br.readLine());

        double b = convertirTemperatura(a);

        System.out.format("%.2f ºC equivalen a %.2f ºF", a, b);
    }
}
