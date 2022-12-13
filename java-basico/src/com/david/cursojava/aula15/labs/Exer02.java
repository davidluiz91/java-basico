package com.david.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);
        //Faça um programa que paça um valor e mostre na tela se o valor é positivo ou negativo.

        System.out.print("Entre com um número: ");
        double num = scan.nextDouble();
        if (num >= 0){
            System.out.println("O número : " + num + " é positivo.");
        }else {
            System.out.println("O número: " + num +" é negativo");
        }
    }
}
