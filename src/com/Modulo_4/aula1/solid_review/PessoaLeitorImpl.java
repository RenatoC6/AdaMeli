package com.Modulo_4.aula1.solid_review;

import java.util.List;

public class PessoaLeitorImpl implements Reader<Pessoa>, ReaderByName<Pessoa>{
    @Override
    public List<Pessoa> read() {
        System.out.println("Lendo Dados de Pessoa");
        return List.of();
    }

    @Override
    public Pessoa read(String nome) {
        System.out.println("buscando por nome");
        return null;
    }
}
