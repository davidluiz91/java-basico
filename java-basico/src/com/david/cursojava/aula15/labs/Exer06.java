package com.david.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);

        //Faça um Programa que leia três  números e mostre o maior deles.

        System.out.println("Entre com o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Entre com o segundo número: ");
        double num2 = scan.nextDouble();
        System.out.println("Entre com o terceiro número: ");
        double num3 = scan.nextDouble();

        if (num1 > num2 && num1 > num3){
            System.out.println(num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }
    }
}
