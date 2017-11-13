package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un valor: ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("La funcion de fibonacci recursiva es: " + fibonacci(a));

    }

    public static int fibonacci(int numero) {
        if (numero == 1)
            return 0;

        else if (numero == 2 || numero == 3)
            return 1;
        else
            return (fibonacci(numero - 1) + fibonacci(numero - 2));

    }

}