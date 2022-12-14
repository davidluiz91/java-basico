package com.david.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);
        /***
         * Faça um programa que pergunte em que turno você estuda.
         * peça para digitar  M-matutino ou V-vespertino ou N-Noturno.
         * Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Invalido!", conforme o caso.
         ***/
        System.out.println("Em que turno você estuda, digite: (M)-matutino ou (V)-vespertino ou (N)-Noturno. ");
        String turno = scan.next();
        switch (turno.toLowerCase()){
            case "m":
                System.out.println("Bom dia!"); break;
            case "v":
                System.out.println("Boa tarde!"); break;
            case "n":
                System.out.println("Boa noite!"); break;
            default:
                System.out.println("Valor inválido!");
        }

    }
}
