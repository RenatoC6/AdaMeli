package com.Modulo_4.aula2.exercicio.Impl;

import com.Modulo_4.aula2.exercicio.Behaviour.Flutuar;
import com.Modulo_4.aula2.exercicio.Behaviour.Mover;
import com.Modulo_4.aula2.exercicio.Behaviour.Velocidade;
import com.Modulo_4.aula2.exercicio.Behaviour.Voar;

public class Aviao extends Automotive implements Flutuar, Mover, Voar, Velocidade {


    public Aviao() {
        super(new Motor[]{
                new Motor("Rolls royce ONE"),
                new Motor("Rolls royce ONE")
        });
    }

    @Override
    public void flutuar() {
        System.out.println("Aviao flutuando");
    }

    @Override
    public void mover() {
        System.out.println("Aviao em movimento");
    }

    @Override
    public void voar() {
        System.out.println("Aviao voando");
    }

    @Override
    public void aumentar(float value) {
        System.out.println("Aviao aumentou a velocidade");
    }

    @Override
    public void diminuir(float value) {
        System.out.println("Aviao diminuiu a velocidade");
    }

}

