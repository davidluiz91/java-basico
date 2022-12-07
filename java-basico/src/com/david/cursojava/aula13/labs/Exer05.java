package com.david.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;
//convertendo metros em centimetros
public class Exer05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);

        System.out.println("Digite quantos metros: ");
        float metros = scan.nextFloat();

        float centimetros = metros*100;
        System.out.println("Convertendo você terá: " + centimetros);



    }
}
