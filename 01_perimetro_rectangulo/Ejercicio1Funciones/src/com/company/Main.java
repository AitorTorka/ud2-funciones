package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static int perimetroRectangulo(int altura, int base) {

        int area = (base+altura)*2;
        return area;

    }

    public static void main(String[] args) throws IOException {
	/* Introduce por teclado los valores correspondientes a la base y la altura de un rectángulo e imprime su
       perímetro usando la función perimetroRectangulo(), que recibirá esos valores como parámetros y retornará
       el resultado*/

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce una altura: ");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Introduce una base: ");
        int b = Integer.parseInt(br.readLine());

        int c = perimetroRectangulo(a, b);

        System.out.println("El area es: " +c);
    }
}
