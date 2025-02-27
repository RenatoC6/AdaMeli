package com.Modulo_3.aula6.exercicioDecoretor;

public class AppDecorator {

    public static void main(String[] args) {

        TextoSimples textoSimples = new TextoSimples();
        MaiusculoDecoretor maiusculoDecoretor = new MaiusculoDecoretor(textoSimples);
        AsteristicoDecoretor asteristicoDecoretor = new AsteristicoDecoretor(maiusculoDecoretor);
        System.out.println(maiusculoDecoretor.formatar("Texto para maiusculo"));
        System.out.println(asteristicoDecoretor.formatar("Texto para asteristico"));
    }
}
