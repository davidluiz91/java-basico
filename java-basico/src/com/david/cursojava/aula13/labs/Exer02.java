package com.david.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);

        System.out.println("Digite um numero: ");

        float numero = scan.nextFloat();

        System.out.println("Você digitou: " + numero);



    }
}
