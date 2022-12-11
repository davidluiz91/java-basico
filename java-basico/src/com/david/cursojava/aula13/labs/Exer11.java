package com.david.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        /*
        Faça um programa que peça 2 números inteiros e um número real.
        Calcule e mostre:
        a. o produto do dobro do primeiro com metade do segundo.
        b. a soma do triplo do primeiro com o terceiro.
        c. o terceiro elevado ao cubo.
         */
        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);

        System.out.println("Digite um número inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Digite um segundo número inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Entre com um número real: ");
        double num3 = scan.nextDouble();

        double resultado1 = (num1 * 2) * (num2 / 2);

        double resultado2 = (num1 * 3) + num3;

        double resultado3 = Math.pow(num3, 3);

        System.out.println("a = " + resultado1);
        System.out.println("b = " + resultado2);
        System.out.println("c = " + resultado3);

    }
}
