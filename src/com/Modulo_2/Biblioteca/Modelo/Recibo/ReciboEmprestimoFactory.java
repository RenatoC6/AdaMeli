package com.Modulo_2.Biblioteca.Modelo.Recibo;

import com.Modulo_2.Biblioteca.Modelo.Livro;
import com.Modulo_2.Biblioteca.Modelo.Locador;
import com.Modulo_2.Biblioteca.Modelo.RegraDeEmprestimo;

import java.time.LocalDateTime;

// construtor especial de recibo de emprestimo

public class ReciboEmprestimoFactory{

    public static ReciboEmprestimo criarRecibo(Livro livro, Locador locador) {
        ReciboEmprestimo reciboEmprestimo = new ReciboEmprestimo(livro, locador);
        reciboEmprestimo.dataDeInicio = LocalDateTime.now();
        reciboEmprestimo.dataPrevistaDeDevolucao = gerarDataDevolucao(livro);
        return reciboEmprestimo;
    }
    // private --> esse metodo só pode ser acessivel dentro dessa classe (regra de encapsulamento)
        private static LocalDateTime gerarDataDevolucao(Livro livro) {
        if (livro.regraDeEmprestimo == RegraDeEmprestimo.CURTA_DURACAO) {
            return LocalDateTime.now().plusDays(1);
        } else if (livro.regraDeEmprestimo == RegraDeEmprestimo.MEDIA_DURACAO) {
            return LocalDateTime.now().plusDays(3);
        } else if (livro.regraDeEmprestimo == RegraDeEmprestimo.LONGA_DURACAO) {
            return LocalDateTime.now().plusDays(7);
        }

        throw new IllegalArgumentException("Não foi possível calcular a data de devolução do livro, regraDeEmprestimo inválida");
    }
}

// private: torna incacessivel um campo com (atributo) como um metodo
//    para qualquer outra classe alem da mesma

// privado de pacote (por omissão, quando não coloca nada): torna incacessivel um campo
// com (atributo) como um metodo  para qualquer outra classe que esteja fora do
// pacote da mesma

// protected: torna incacessivel um campo (atributo) como um metodo
// para qualquer outra classe que esteja fora do
// pacote da mesma

//public: libero geral.. mesmo fora do pacote

//Abstração: focar no essencial, ignorando o irrelevante
//Encapsulamento: esconder os detalhes. expondo apenas o essencial
//Herança: reutilizar codigo, criando hierarquias de classes
//Polimorfismo: responder a uma mensagem de maneiras diferentes

