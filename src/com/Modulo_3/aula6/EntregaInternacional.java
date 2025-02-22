package com.Modulo_3.aula6;

public class EntregaInternacional implements ModalidadeEntrega{
    @Override
    public double calcularFrete(double valorPedido) {
        return valorPedido + 50.0;
    }
}
