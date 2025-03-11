package com.Modulo_4.aula2.exercicio.Impl;

import com.Modulo_4.aula2.exercicio.Behaviour.Flutuar;
import com.Modulo_4.aula2.exercicio.Behaviour.Mover;
import com.Modulo_4.aula2.exercicio.Behaviour.Velocidade;

public class Barco extends Automotive implements Mover, Flutuar, Velocidade {


    public Barco() {
        super(new Motor[]{
                new Motor("Yamaha Y1")
        });
    }

    @Override
    public void flutuar() {
        System.out.println("Barco flutuando");
    }

    @Override
    public void mover() {
        System.out.println("Barco em movimento");
    }

    @Override
    public void aumentar(float value) {
        System.out.println("Barco aumentou a velocidade");
    }

    @Override
    public void diminuir(float value) {
        System.out.println("Barco diminuiu a velocidade");
    }
}

