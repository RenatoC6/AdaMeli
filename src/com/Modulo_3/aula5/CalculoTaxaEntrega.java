package com.Modulo_3.aula5;

public class CalculoTaxaEntrega {

    public double calcularTaxaEntrega(Pedido pedido) {
        return pedido.getValor() * 0.1;
    }
}
