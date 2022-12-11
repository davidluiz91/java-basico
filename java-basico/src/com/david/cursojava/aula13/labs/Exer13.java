package com.david.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scan.useLocale(locale);
        /*
         Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
         Calcule e mostre o total do seu salário no referido mÊs, sabendo-se que são descontados 11% para
         o imposto de renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:

         - salário bruto.
         a. quanto pagou ao INSS.
         b. quanto pagou ao sindicato.
         c. o salário líquido.
         d. calcule os descontos e o salário líquido, conforme a tabela abaixo:

         + salário Bruto : R$ - IR (11%) : R$ - INSS
         (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$
        */

        System.out.println("Quando você ganha por hora: ");
        double salarioHora = scan.nextDouble();

        System.out.println("Quantas horas trabalhadas no mês: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = salarioHora * horasTrabalhadas;
        double iR = (salarioBruto / 100) * 11;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double totalDescontos = iR + inss + sindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("salário bruto: " + salarioBruto);
        System.out.println("INSS: "+ inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("IR" + iR);
        System.out.println("Total descontos: " + totalDescontos);
        System.out.println("Salário Líquido: "+ salarioLiquido);


    }
}
