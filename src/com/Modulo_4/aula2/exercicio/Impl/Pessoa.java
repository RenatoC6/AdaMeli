package com.Modulo_4.aula2.exercicio.Impl;

import com.Modulo_4.aula2.exercicio.Behaviour.Caminhar;
import com.Modulo_4.aula2.exercicio.Behaviour.Flutuar;
import com.Modulo_4.aula2.exercicio.Behaviour.Mover;
import com.Modulo_4.aula2.exercicio.Behaviour.Velocidade;

public class Pessoa implements Mover, Caminhar, Flutuar, Velocidade {


    @Override
    public void caminhar() {
        System.out.println("Humando esta caminhando");
    }

    @Override
    public void mover() {
        System.out.println("pessoa em movimento");
    }

    @Override
    public void flutuar() {
        System.out.println("pessoa flutuando");
    }

    @Override
    public void aumentar(float value) {
        System.out.println("pessoa aumentou a velocidade");
    }

    @Override
    public void diminuir(float value) {
        System.out.println("pessoa diminuiu a velocidade");

    }
}

