package com.david.cursojava.aula24.labs;

import java.util.Date;

public class Exer04 {
    public static void main(String[] args) {

        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.qtdPaginas = 330;
        livro.anoLancamento = 2015;
        livro.isbn = "pt-BR";

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "David Luiz";


        System.out.println("Nome do livro = " + livro.nome);
        System.out.println(livro.emprestado);
        System.out.println("Livro emprestado à = " + livro.emprestadoA);
    }
}
