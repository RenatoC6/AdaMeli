package com.Modulo_2.Biblioteca;

import java.time.LocalDateTime;

public class ReciboEmprestimo {

    ReciboEmprestimo(Livro livro, Locador locador) {
        this.livro = livro;
        this.locador = locador;
    }


    LocalDateTime dataDeInicio;

    Livro livro;

    Locador locador;

    LocalDateTime dataPrevistaDeDevolucao;

}
