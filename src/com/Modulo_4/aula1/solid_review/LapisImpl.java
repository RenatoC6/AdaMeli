package com.Modulo_4.aula1.solid_review;

public class LapisImpl<T> implements Writer<T>{
    @Override
    public void write(T object) {
        System.out.println("Escrevendo a lápis");
        System.out.println(object.toString());

    }
}

