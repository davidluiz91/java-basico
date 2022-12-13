package com.david.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);
        /**
         * Faça um programa que que verifique se uma letra digitada é F ou M.
         * Conforme a letra escrever: F- Feminino, M-Masculino, Sexo inválido.
         */

        System.out.println("Informe seu sexo F-Feminino ou M-Masculino: ");
        String sexo = scan.next();


        switch (sexo.toLowerCase()) {
            case "f":
                System.out.println("Feminino"); break;
            case "m":
                System.out.println("Masculino"); break;
            default:
                System.out.println("Sexo inválido");

        }

    }
}
