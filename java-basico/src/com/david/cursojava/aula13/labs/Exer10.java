package com.david.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        /*
        Faça um programa que peça a temperatura em graus Celsius,
        transforme e mostre em graus Farenheit.
        */

        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);

        System.out.println("Entre com a temperatura em graus Celsius: ");
        double c = scan.nextDouble();

        double f = (c * 1.8) + 32;
        System.out.println("Transformando em Farenheit: "+ f);
    }
}
