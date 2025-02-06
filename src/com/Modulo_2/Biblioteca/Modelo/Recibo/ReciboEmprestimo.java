package com.Modulo_2.Biblioteca.Modelo.Recibo;

import com.Modulo_2.Biblioteca.Locador;
import com.Modulo_2.Biblioteca.Modelo.Livro;

import java.time.LocalDateTime;

public class ReciboEmprestimo {

    ReciboEmprestimo(Livro livro, Locador locador) {
        this.livro = livro;
        this.locador = locador;
    }

    LocalDateTime dataDeInicio;

    Livro livro;

    Locador locador;

    public LocalDateTime dataPrevistaDeDevolucao;






}
