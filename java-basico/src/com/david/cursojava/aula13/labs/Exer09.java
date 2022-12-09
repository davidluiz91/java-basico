package com.david.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        /* Faça um Programa que paça a temperatura em
        graus Farenheit, transforme e mostre a temperatura em
        graus Celsius. */

        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);

        System.out.println("Informe a temperatura em Farenheit: ");
        double farenheit = scan.nextDouble();

        double celsius = (5 * (farenheit-32) / 9);
        System.out.println("Transformando em Celsius fica: " + celsius);

    }
}
