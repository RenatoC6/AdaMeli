package com.Modulo_3.aula6.exercicioDecoretor;

public abstract class DecoratorTexto implements Formatador{

    protected Formatador formatador;

    public DecoratorTexto(Formatador formatador) {
        this.formatador = formatador;
    }

    @Override
    public String formatar(String texto){
        return formatador.formatar(texto);
    }
}
