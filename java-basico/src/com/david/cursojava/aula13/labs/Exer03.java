package com.david.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 =  scan.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scan.nextInt();

        int total = num1 + num2;
        System.out.println("A soma entre os números é: " + total);
    }
}
