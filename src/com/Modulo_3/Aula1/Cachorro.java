package com.Modulo_3.Aula1;

public class Cachorro extends Animal implements AdotavelInterface{

    public void emitirSom(){
        System.out.println("cachorro Latindo");
    }

    @Override
    public void proteger() {
        System.out.println("latir");

    }

    @Override
    public void treinar() {

    }

//    @Override
//    public void adotar() {
//
//    }
}
