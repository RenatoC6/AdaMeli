package com.Modulo_4.aula2.exercicio.Impl;

import com.Modulo_4.aula2.exercicio.Behaviour.Caminhar;
import com.Modulo_4.aula2.exercicio.Behaviour.Flutuar;
import com.Modulo_4.aula2.exercicio.Behaviour.Mover;
import com.Modulo_4.aula2.exercicio.Behaviour.Voar;

public class Main {

    public static void main(String[] args) {

        var carro = new Carro();
        move(carro);

        var moto = new Moto();
        move(moto);

        var aviao = new Aviao();
        voar(aviao);

        var barco = new Barco();
        flutuar(barco);

        var pato = new Pato();
        flutuar(pato);

        var pessoa = new Pessoa();
        caminhar(pessoa);

        //Pessoa e pato caminhar e flutuar
        var pato2 = new Pato();
        caminharAndflutuar(pato2);

        var pessoa2 = new Pessoa();
        caminharAndflutuar(pessoa2);
    }

    public static void move(Mover mover){
         mover.mover();
    }

    public static void caminhar(Caminhar caminhar){
        caminhar.caminhar();
    }

    public static void voar(Voar voar) {voar.voar();}

    public static void flutuar(Flutuar flutuar){flutuar.flutuar();}

    public static <T extends Caminhar & Flutuar> void caminharAndflutuar(T caminharAndflutuar) {
        caminharAndflutuar.caminhar();
        caminharAndflutuar.flutuar();
      }
}
