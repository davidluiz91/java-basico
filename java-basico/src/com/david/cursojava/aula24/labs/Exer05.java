package com.david.cursojava.aula24.labs;

public class Exer05 {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.numeroConta = 329865;
        conta.saldo = 0.50;
        conta.especial = false;
        conta.limite = 10.50;

        System.out.println("Número da conta: " + conta.numeroConta + " Saldo: " +conta.saldo + " Conta especial: "
                +conta.especial + " Limite da conta: " + conta.limite);

    }
}
