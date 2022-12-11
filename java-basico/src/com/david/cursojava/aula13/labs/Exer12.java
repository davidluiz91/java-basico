package com.david.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        /*
        Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo
        que calcule seu peso ideal, usando a seguinte fórmula:
        (72.7*altura) - 58
        */
        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);

        System.out.println("Entre com a altura: ");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal é: " + pesoIdeal);

    }
}
