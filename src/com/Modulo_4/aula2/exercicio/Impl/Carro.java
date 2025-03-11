package com.Modulo_4.aula2.exercicio.Impl;

import com.Modulo_4.aula2.exercicio.Behaviour.Mover;
import com.Modulo_4.aula2.exercicio.Behaviour.Velocidade;

public class Carro extends Automotive implements Mover, Velocidade {

    private float speed = 0;

    public Carro() {
        super(new Motor[]{
                new Motor("Gas motor one"),
                new Motor("Electric motor one")
        });
    }

    @Override
    public void mover() {
        speed += 1;
        speed += 1;
        System.out.println("Carro se movendo a "+speed+" km/h");
    }

    @Override
    public void aumentar(float value) {
        speed += 1;
        System.out.println("Carro aumentou a velocidade para "+speed+" km/h");
    }

    @Override
    public void diminuir(float value) {
        speed -= value;
        System.out.println("Carro diminuiu a velocidade para "+speed+" km/h");
    }
}
