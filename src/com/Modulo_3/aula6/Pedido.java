package com.Modulo_3.aula6;

public class Pedido {

    private double valorPedido;
    private ModalidadeEntrega modalidade;

    public Pedido(double valorPedido, ModalidadeEntrega modalidadeEntrega) {
        this.valorPedido = valorPedido;
        this.modalidade = modalidadeEntrega;
    }

    public double calcularTotal(){
        return  this.valorPedido + modalidade.calcularFrete();

    }

}
