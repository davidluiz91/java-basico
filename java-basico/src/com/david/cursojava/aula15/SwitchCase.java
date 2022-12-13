package com.david.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número entre (1-7): ");
        int dia = scan.nextInt();

        if (dia == 1){
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda");
        } else if (dia == 3) {
            System.out.println("Terça");
        } else if (dia == 4) {
            System.out.println("Quarta");
        } else if (dia == 5) {
            System.out.println("Quinta");
        } else if (dia == 6) {
            System.out.println("Sexta");
        } else if (dia == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Entre com um número válido.");
        }

        switch(dia){
            case 1: System.out.println("Domingo");break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Entre com um número válido.");
        }

        switch(dia){
            case 6:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("Dia de semana"); break;
            case 1:
            case 7: System.out.println("Fim de semana"); break;
            default: System.out.println("Entre com um número válido.");
        }
    }

}