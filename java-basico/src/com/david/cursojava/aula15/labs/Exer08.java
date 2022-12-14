package com.david.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);
        //Faça um programa que pergunte o preço de três produtos e informe qual
        //produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

        System.out.println("Preço do primeiro produto: ");
        double preco1 = scan.nextDouble();
        System.out.println("Preço do segundo produto: ");
        double preco2 = scan.nextDouble();
        System.out.println("Preço do terceiro produto: ");
        double preco3 = scan.nextDouble();

        if (preco1 < preco2 && preco1 < preco3){
            System.out.println("Produto 1 mais barato: " + preco1);
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("Produto 2 mais barato: "+ preco2);
        } else System.out.println("Produto 3 mais barato: "+ preco3);
    }
}
