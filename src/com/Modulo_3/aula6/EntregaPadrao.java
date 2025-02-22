package com.Modulo_3.aula6;

public class EntregaPadrao implements ModalidadeEntrega {

    @Override
    public double calcularFrete(double valorPedido) {
        return valorPedido + 10.00;
    }

}