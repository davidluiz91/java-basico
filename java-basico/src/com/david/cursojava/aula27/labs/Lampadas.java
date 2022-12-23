package com.david.cursojava.aula27.labs;

public class Lampadas {
//Escreva uma classe para representar uma lampada.
//Desenvolva métodos para ligar, desligar a lampada.

    String modelo;
    String tensao;
    double potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada;

    void ligarLampada(){
        ligada = true;
    }

    void desligarLampada(){
        ligada = false;
    }

    void mostrarEstado(){
        if (ligada){
            System.out.println("Lampada esta ligada");
        }else {
            System.out.println("Lampada desligada");
        }
    }

    void mudarEstado(){
        if (ligada){
            desligarLampada();
        }else {
            ligarLampada();
        }
    }
}
