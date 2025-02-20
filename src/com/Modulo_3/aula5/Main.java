package com.Modulo_3.aula5;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1111, 50000);

        System.out.println("==================================");

        CalculoTaxaEntrega calculartaxa = new CalculoTaxaEntrega();
        double pedidocomtaxa = pedido.getValor() + calculartaxa.calcularTaxaEntrega(pedido);

        Repositorio repositorio = new Repositorio();
        repositorio.salvarNoBanco(pedido);

        Notificacao notificação = new Notificacao();
        notificação.enviarNotificacao(pedido);

        Impressora impressora = new Impressora();
        impressora.gerarRecibo(pedido);

        System.out.println("Valor total do pedido nr: " + pedido.getId() +
                " Valor total do pedido com taxa de entrega: " + pedidocomtaxa);

    }
}
