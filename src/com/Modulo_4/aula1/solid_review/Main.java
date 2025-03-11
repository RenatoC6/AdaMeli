package com.Modulo_4.aula1.solid_review;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        var william = new Pessoa();
        william.setNome("Willian");

        write(william, new LapisImpl<Pessoa>());

        var b20 = new Carro();
        b20.setModelo("b20 da massa");

        write(b20, new CanetaImpl<>());

        read(new PessoaLeitorImpl());

        delete(william, new BorrachaImpl<>());
        delete(b20, new BorrachaImpl<>());

    }

    public static <T> void write(T object, Writer<T> writer) {
        writer.write(object);
    }

    public static <T> List<T> read(Reader<T> reader) {
        return reader.read();
    }

    public static <T> void delete(T object, Delete<T> delete) {
        delete.delete(object);
    }


}

