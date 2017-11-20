package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static String morse(String caracter) {

        if (caracter.equalsIgnoreCase("STOP"))
            return "Programa finalizado";
        else return caracter
                .replaceAll("A", ".-").replaceAll("a", ".-")
                .replaceAll("B", "-...").replaceAll("b", "-...")
                .replaceAll("C", "-.-.").replaceAll("c", "-.-.")
                .replaceAll("D", "-..").replaceAll("d", "-..")
                .replaceAll("E", ".").replaceAll("e", ".")
                .replaceAll("F", "..-.").replaceAll("f", "..-.")
                .replaceAll("G", "--.").replaceAll("g", "--.")
                .replaceAll("H", "....").replaceAll("h", "....")
                .replaceAll("I", "..").replaceAll("i", "..")
                .replaceAll("J", ".---").replaceAll("j", ".---")
                .replaceAll("K", "-.-").replaceAll("k", "-.-")
                .replaceAll("L", ".-..").replaceAll("l", ".-..")
                .replaceAll("M", "--").replaceAll("m", "--")
                .replaceAll("N", "-.").replaceAll("n", "-.")
                .replaceAll("Ñ", "--.--").replaceAll("ñ", "--.--")
                .replaceAll("O", "---").replaceAll("o", "---")
                .replaceAll("P", ".--.").replaceAll("p", ".--.")
                .replaceAll("Q", "--.-").replaceAll("q", "--.-")
                .replaceAll("R", ".-.").replaceAll("r", ".-.")
                .replaceAll("S", "...").replaceAll("s", "...")
                .replaceAll("T", "_").replaceAll("t", "_")
                .replaceAll("U", "..-").replaceAll("u", "..-")
                .replaceAll("V", "...-").replaceAll("v", "...-")
                .replaceAll("W", ".--").replaceAll("w", ".--")
                .replaceAll("X", "-..-").replaceAll("x", "-..-")
                .replaceAll("Y", "-.--").replaceAll("y", "-.--")
                .replaceAll("Z", "--..").replaceAll("z", "--..")
                .replaceAll("0", "-----")
                .replaceAll("1", ".----")
                .replaceAll("2", "..---")
                .replaceAll("3", "...--")
                .replaceAll("4", "....-")
                .replaceAll("5", ".....")
                .replaceAll("6", "-....")
                .replaceAll("7", "--...")
                .replaceAll("8", "---..")
                .replaceAll("9", "----.")
                .replaceAll("\\s+", " ");
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String texto;
        do {
            System.out.println("Write text or STOP to finish: ");
            texto = br.readLine();
            System.out.println(morse(texto));
        } while (!texto.equalsIgnoreCase("STOP"));

    }
}