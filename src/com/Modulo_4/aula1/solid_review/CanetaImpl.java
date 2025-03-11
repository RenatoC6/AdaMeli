package com.Modulo_4.aula1.solid_review;

public class CanetaImpl<T> implements Writer<T>{
    @Override
    public void write(T object) {

        System.out.println("escrevendo a caneta");
        System.out.println(object.toString());

    }
}
