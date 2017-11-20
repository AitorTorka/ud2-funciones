package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void morse(char caracter) {


        if (caracter == 'a' || caracter == 'A'){System.out.print(".-");}
        if (caracter == 'b' || caracter == 'B'){System.out.print("-...");}
        if (caracter == 'c' || caracter == 'C'){System.out.print("-.-.");}
        if (caracter == 'd' || caracter == 'D'){System.out.print("-..");}
        if (caracter == 'e' || caracter == 'E'){System.out.print(".");}
        if (caracter == 'f' || caracter == 'F'){System.out.print("..-.");}
        if (caracter == 'g' || caracter == 'G'){System.out.print("--.");}
        if (caracter == 'h' || caracter == 'H'){System.out.print("....");}
        if (caracter == 'i' || caracter == 'I'){System.out.print("..");}
        if (caracter == 'j' || caracter == 'J'){System.out.print(".---");}
        if (caracter == 'k' || caracter == 'K'){System.out.print("-.-.");}
        if (caracter == 'l' || caracter == 'L'){System.out.print(".-..");}
        if (caracter == 'm' || caracter == 'M'){System.out.print("--");}
        if (caracter == 'n' || caracter == 'N'){System.out.print("-.");}
        if (caracter == 'ñ' || caracter == 'Ñ'){System.out.print("||");}
        if (caracter == 'o' || caracter == 'O'){System.out.print("---");}
        if (caracter == 'p' || caracter == 'P'){System.out.print(".--.");}
        if (caracter == 'q' || caracter == 'Q'){System.out.print("--.-");}
        if (caracter == 'r' || caracter == 'R'){System.out.print(".-.");}
        if (caracter == 's' || caracter == 'S'){System.out.print("...");}
        if (caracter == 't' || caracter == 'T'){System.out.print("_");}
        if (caracter == 'u' || caracter == 'U'){System.out.print("..-");}
        if (caracter == 'v' || caracter == 'V'){System.out.print("...-");}
        if (caracter == 'w' || caracter == 'W'){System.out.print(".--");}
        if (caracter == 'x' || caracter == 'X'){System.out.print("-..-");}
        if (caracter == 'y' || caracter == 'Y'){System.out.print("-.--");}
        if (caracter == 'z' || caracter == 'Z'){System.out.print("--..");}
        if (caracter == '0'){System.out.print("-----");}
        if (caracter == '1'){System.out.print(".----");}
        if (caracter == '2'){System.out.print("..---");}
        if (caracter == '3'){System.out.print("...--");}
        if (caracter == '4'){System.out.print("....-");}
        if (caracter == '5'){System.out.print(".....");}
        if (caracter == '6'){System.out.print("-....");}
        if (caracter == '7'){System.out.print("--...");}
        if (caracter == '8'){System.out.print("---..");}
        if (caracter == '9'){System.out.print("----.");}
        if (caracter == '.'){System.out.print(".-.-.-");}
        if (caracter == ','){System.out.print("--..--");}
        if (caracter == '?'){System.out.print("..--..");}
        if (caracter == '!'){System.out.print("-.-.--");}
        if (caracter == ' '){System.out.print(" ");}
    }

    public static void main(String[] args) throws IOException {
    /* Crea una función llamada morse() que reciba una cadena de texto y la devuelva convertida a su
       representación en código morse.

       Escribe un programa que pida al usuario una frase y use la función para traducirla a morse.

       Nota: El programa sólo acabará cuando el usuario escriba la frase STOP.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String texto;

        do {
            System.out.println("\nWrite text or STOP to finish: ");
            texto = br.readLine().toLowerCase();

            for (int i = 0; i < texto.length(); i++) {
                morse(texto.charAt(i));
            }
        } while (!texto.equalsIgnoreCase("STOP"));


    }
}
