package com.Modulo_3.aula9;

public class PagamentoCartao implements MetodosDePagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processamento Cartao: " + "valor de: " + valor);
    }
}
