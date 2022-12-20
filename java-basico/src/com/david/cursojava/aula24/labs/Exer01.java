package com.david.cursojava.aula24.labs;

public class Exer01 {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "Amarela";
        lampada.garantiaMeses = 36;
        lampada.tipoAbajur = true;

        lampada.tipos =  new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";

        System.out.println(lampada.modelo);
        System.out.println(lampada.tensao);
        System.out.println(lampada.potencia);
        System.out.println(lampada.cor);
        System.out.println(lampada.tipoLuz);
        System.out.println(lampada.garantiaMeses);
        System.out.println(lampada.tipoAbajur);
            }
}
