package com.david.cursojava.aula24.labs;

public class Exer06 {
    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.nome = "David Luiz";
        contato.email = "dvdluiz1991@gmail.com";
        contato.endereco = "Rua José Marques Ribeiro";

        contato.telefones = new String[5];
        contato.telefones[0] = "82999559923";
        contato.telefones[1] = "82991913020";
        contato.telefones[2] = "82999999999";

        System.out.println("Nome: " +contato.nome + " E-mail: " + contato.email + " Endereço: "
                + contato.endereco + " Telefones: " + contato.telefones);
    }
}
