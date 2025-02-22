package com.Modulo_3.aula6;

public class EntregaExpressa implements ModalidadeEntrega{
    @Override
    public double calcularFrete(double valorPedido) {
        return valorPedido + 20.00;
    }
}
