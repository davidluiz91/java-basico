package com.david.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);
        //Faça um programa que leia três números e mostre-os em ordem decrescente.
        /**
         * a - b - c
         * a - c - b
         * b - a - c
         * b - c - a
         * c - a - b
         * c - b - a
         * **/

        System.out.println("Entre com o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Entre com o segundo número: ");
        double num2 = scan.nextDouble();
        System.out.println("Entre com o terceiro número: ");
        double num3 = scan.nextDouble();

        if (num1 <= num2 && num1 <= num3 && num2 <= num3){
            //num1 é menor
            //num3 é maior
            //num1 < num2 < num3
            System.out.println(num3 + " - " + num2 + " - " + num1);
        }else if (num1 <= num2 && num1 <= num3 && num3 <= num2){
            //num1 é menor
            //num2 é maior
            //num1 < num3 < num2
            System.out.println(num2 + " - " + num3 + " - " + num1);
        }else if (num2 <= num1 && num2 <= num3 && num1 <= num3){
            //num2 é menor
            //num3 é maior
            //num2 < num1 < num3
            System.out.println(num3 + " - " + num1 + " - " + num2);
        }else if (num2 <= num1 && num2 <= num3 && num3 <= num1){
            //num2 é menor
            //num1 é maior
            //num2 < num3 < num1
            System.out.println(num1 + " - " + num3 + " - " + num2);
        }else if (num3 <= num1 && num3 <= num2 && num1 <= num2){
            //num3 é menor
            //num2 é maior
            //num3 < num1 < num2
            System.out.println(num2 + " - " + num1 + " - " + num3);
        }else if (num3 <= num1 && num3 <= num2 && num2 <= num1){
            //num3 é menor
            //num1 é maior
            //num3 < num2 < num1
            System.out.println(num1 + " - " + num2 + " - " + num3);
        }
    }
}
