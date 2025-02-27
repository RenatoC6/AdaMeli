package com.Modulo_3.aula9;

public class ServicoDePedidos {

    private MetodosDePagamento metodoDePagamento;
    private ServicosDeNotificacao servicosDeNotificacao;

    public ServicoDePedidos(MetodosDePagamento metodoDePagamento, ServicosDeNotificacao servicosDeNotificacao) {
        this.metodoDePagamento = metodoDePagamento;
        this.servicosDeNotificacao = servicosDeNotificacao;
    }

    public void finalizarPedido(double valor){
        this.metodoDePagamento.processarPagamento(valor);
        this.servicosDeNotificacao.send("Pedido realizado com sucesso");
    }

}
