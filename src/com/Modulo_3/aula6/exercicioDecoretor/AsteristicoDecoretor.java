package com.Modulo_3.aula6.exercicioDecoretor;

public class AsteristicoDecoretor extends DecoratorTexto{

    public AsteristicoDecoretor(Formatador formatador) {
        super(formatador);
    }

    @Override
    public String formatar(String texto) {
        return "*" + super.formatar(texto) + "*";
    }



}
