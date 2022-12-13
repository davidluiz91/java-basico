package com.david.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);
        /*
        Faça um programa que peça dois números e imprima o maior deles.
        */
        System.out.println("Entre com um número: ");
        double num1 = scan.nextDouble();
        System.out.println("Entre com outro número: ");
        double num2 = scan.nextDouble();

        if (num1 > num2){
            System.out.println(num1);
        } else if (num1 == num2) {
            System.out.println("Números iguais");
        }else{
            System.out.println(num2);
        }
    }
}
