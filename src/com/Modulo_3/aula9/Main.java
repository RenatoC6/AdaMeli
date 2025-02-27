package com.Modulo_3.aula9;

public class Main {

    public static void main(String[] args) {

        MetodosDePagamento pagamentoPix= new PagamentoPix();
        ServicosDeNotificacao notificacaoWhats = new NotificacaoWhats();
        ServicoDePedidos servicoDePedidos = new ServicoDePedidos(pagamentoPix, notificacaoWhats);
        servicoDePedidos.finalizarPedido(1000);

        MetodosDePagamento pagamentoCartao = new PagamentoCartao();
        ServicosDeNotificacao notificacaoEmail = new NotificacaoEmail();
        ServicoDePedidos servicoDePedidos1 = new ServicoDePedidos(pagamentoCartao, notificacaoEmail);
        servicoDePedidos1.finalizarPedido(2000);

    }
}
