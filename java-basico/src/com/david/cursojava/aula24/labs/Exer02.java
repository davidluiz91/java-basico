package com.david.cursojava.aula24.labs;

public class Exer02 {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.qtdPaginas = 330;
        livro.anoLancamento = 2015;
        livro.isbn = "pt-BR";

        System.out.println("Nome do livro = " + livro.nome);
    }
}
