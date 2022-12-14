package com.david.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);

        //Faça um programa que leia três números e mostre o maior e o menor deles.
        System.out.print("Entre com o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.print("Entre com o segundo número: ");
        double num2 = scan.nextDouble();
        System.out.print("Entre com o terceiro número: ");
        double num3 = scan.nextDouble();

        if (num1 > num2 && num1 > num3){
            System.out.print("O maior é num1: " + num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.print("O maior é num2: " + num2);
        }else {
            System.out.println("O maior é num3: " + num3);
        }

        if (num1 < num2 && num1 < num3){
            System.out.println("O menor é num1: " + num1);
        }else if (num2 < num1 && num2 < num3){
            System.out.println("O menor é num2: " + num2);
        }else {
            System.out.println("O menor é num3: " + num3);
        }
    }
}

