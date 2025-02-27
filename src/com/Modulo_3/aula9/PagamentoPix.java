package com.Modulo_3.aula9;

public class PagamentoPix implements MetodosDePagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processamento Pix: " + "valor de: " + valor);
    }
}
