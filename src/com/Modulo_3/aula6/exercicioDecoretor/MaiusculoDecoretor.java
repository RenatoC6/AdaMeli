package com.Modulo_3.aula6.exercicioDecoretor;

public class MaiusculoDecoretor extends DecoratorTexto{

    public MaiusculoDecoretor(Formatador formatador){
        super(formatador);
    }

    @Override
    public String formatar(String texto) {
        return super.formatar(texto).toUpperCase();
    }
}
