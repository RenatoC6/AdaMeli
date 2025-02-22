package com.Modulo_3.aula6;

public class Main {

    public static void main(String[] args) {

        Pedido pedidoPadrao = new Pedido(100.0, new EntregaPadrao());
        System.out.printf("Total (Padrão): R$ %.2f\n", pedidoPadrao.calcularTotal());

        Pedido pedidoExpresso = new Pedido(100.0, new EntregaExpressa());
        System.out.printf("Total (Expresso): R$ %.2f\n", pedidoExpresso.calcularTotal());

        Pedido pedidoInternacional = new Pedido(100.0, new EntregaInternacional());
        System.out.printf("Total (Internacional): R$ %.2f\n", pedidoInternacional.calcularTotal());


    }
}
