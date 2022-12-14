package com.david.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);
        /**
         * Faça um programa que verifique se a letra digitada é uma vogal ou consoante.
        **/

        System.out.println("Entre com uma letra: ");
        String letra = scan.next();

        switch (letra.toLowerCase()){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("É uma vogal."); break;
            default:
                System.out.println("É uma consoante.");

        }

    }
}
