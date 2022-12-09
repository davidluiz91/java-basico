package com.david.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);

        /*
        Faça um Programa que pergunte quanto vocÊ ganha por hora
        e o número de horas trabalhadas no mês.
        Calcule e mostre o total do seu salário no referido mês.

        */
        System.out.println("Quanto você ganha por hora: ");
        double salarioHora = scan.nextDouble();

        System.out.println("Quantas horas vocÊ trabalhou no mês: ");
        double horasTrabalhadas = scan.nextDouble();

        System.out.println("Seu salário vai ser: " + (salarioHora * horasTrabalhadas) );


    }
}
