package com.Modulo_4.aula1.solid_review;

public class BorrachaImpl<T> implements Delete<T>{
    @Override
    public void delete(T object) {

        System.out.println("aplicando borracha sobre a escrita");

    }
}

