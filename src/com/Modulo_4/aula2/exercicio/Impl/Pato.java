package com.Modulo_4.aula2.exercicio.Impl;

import com.Modulo_4.aula2.exercicio.Behaviour.*;

public class Pato implements Caminhar, Voar, Mover, Flutuar, Velocidade {


    @Override
    public void caminhar() {
        System.out.println("Pato caminhando");
    }

    @Override
    public void flutuar() {
        System.out.println("Pato flutuando");
    }

    @Override
    public void mover() {
        System.out.println("Pato em movimento");
    }

    @Override
    public void aumentar(float value) {
        System.out.println("Pato aumento a velocidade");
    }

    @Override
    public void diminuir(float value) {
        System.out.println("Pato diminuiu a velocidade");
    }

    @Override
    public void voar() {
        System.out.println("Pato voando");
    }
}

