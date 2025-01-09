package com.Modulo_1.Exercicios;

public class Apllication {

    public static void main(String[] args) {

        soma(1, 2, 3, 4, 5, 6);
        // Esse metodo por receber um numero variavel de parametros que sera recebido em um array.
    }

    // exemplo que mostra um metodo recebendo 'n' parametros representado pelos 3 pontos no recebimento
    // do paramentro pelo metodo.
    // e a variavel se torna um array

    public static void soma(int... a) {
        int resultado = 0;
        for (int i = 0; i < a.length; i++) {
            resultado += a[i];
        }
        System.out.println(resultado);


        }


}
