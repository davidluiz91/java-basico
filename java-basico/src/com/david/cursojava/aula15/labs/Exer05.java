package com.david.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);
        /**
         *Faça um programa para a leitura de duas notas parciais de um aluno
         * O programa deve calcular a média alcançada por aluno e apresentar:
         *    A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
         *    A mensagem "Reprovado", se a média for menor do que sete;
         *    A mensagem "Aprovado com Distinção", se a média for igual a dez.
         **/

        System.out.print("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("Sua média é: " + media);

        if (media >= 7 && media <10){
            System.out.println("Aprovado");
        }if (media < 7) {
            System.out.println("Reprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com Distinção");
        }
    }
}
