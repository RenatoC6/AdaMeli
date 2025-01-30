package com.Modulo_2_Exercicios;

public class Produto{
    String codigo;
    double precoUnitario;
    int quantidade;

    public void Produto(String codigo, double precoUnitario, int quantidade){

        this.codigo = codigo;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }


    public String getCodigo() {
        return this.codigo;
    }
}




