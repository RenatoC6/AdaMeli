package com.Modulo_3.Aula3;

public class Televisor {

    private String marca;
    private double tamanho;
    private double valor;

    public Televisor(String marca, double tamanho, double valor) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "marca='" + marca + '\'' +
                ", tamanho=" + tamanho +
                ", valor=" + valor +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}
