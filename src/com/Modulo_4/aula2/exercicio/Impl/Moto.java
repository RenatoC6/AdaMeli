package com.Modulo_4.aula2.exercicio.Impl;

import com.Modulo_4.aula2.exercicio.Behaviour.Mover;
import com.Modulo_4.aula2.exercicio.Behaviour.Velocidade;

public class Moto extends Automotive implements Mover, Velocidade {

    public Moto() {
        super(new Motor[]{
                new Motor("Kawasawi one")
        });
    }

    @Override
    public void mover() {
        super.speed += 1;
        System.out.println("Moto se movendo a "+speed+" km/h");
    }

    @Override
    public void aumentar(float value) {
        super.increase(value);
        System.out.println("Moto aumentou a velocidade para "+speed+" km/h");
    }

    @Override
    public void diminuir(float value) {
        super.decrease(value);
        System.out.println("Moto diminuiu a velocidade para "+speed+" km/h");

    }
}

