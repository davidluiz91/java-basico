package com.david.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
    // faça um programa que peça o raio de um círculo,
    // calcule e mostre sua área.
        Scanner scan = new Scanner(System.in);

        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);

        System.out.println("Entre com o raio do círculo: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A area do circulo é: "+ area);

    }
}
