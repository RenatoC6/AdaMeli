package com.Modulo_3.aula6;

public class Main {

    public static void main(String[] args) {

        // criação da entrega de forma expressa diretamento na criação do Pedido

        Pedido pedidoPadrao = new Pedido(100.0, new EntregaPadrao());
        System.out.printf("Total (Padrão): R$ %.2f\n", pedidoPadrao.calcularTotal());

        Pedido pedidoExpresso = new Pedido(100.0, new EntregaExpressa());
        System.out.printf("Total (Expresso): R$ %.2f\n", pedidoExpresso.calcularTotal());

        //Aqui a criação da entrega fora do pedido e depois associando..
        // das 2 formas funciona:

        ModalidadeEntrega entregaInternacional = new EntregaInternacional();

        Pedido pedidoInternacional = new Pedido(100.0, entregaInternacional);
        System.out.printf("Total (Internacional): R$ %.2f\n", pedidoInternacional.calcularTotal());


    }
}
