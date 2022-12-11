package com.david.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);
        /*
        Faça um programa que peça o tamanho de um arquivo para
        download (em MB) e a velocidade de um link de internet
        (em Mbps), calcule e informe o tempo aproximado de download
        do arquivo usando este link (em minutos)
        */
        System.out.println("Entre com o tamanho do arquivo: ");
        double tamanho = scan.nextDouble();
        System.out.println("Entre com a velocidade: ");
        double velocidade = scan.nextDouble();
        double tempo = tamanho / velocidade;
        System.out.println("O tempo aproximado é: " + tempo);
    }
}
