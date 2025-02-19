package com.Modulo_3.Aula1;

public class Gato extends Animal implements  AdotavelInterface{

    @Override
    public void emitirSom(){
        System.out.println("gato miando");

    }

    @Override
    public void proteger() {
        System.out.println("miar");

    }

    @Override
    public void treinar() {

    }

//    @Override
//    public void adotar(Animal) {
//
//    }
}
