package com.Modulo_3.aula4;

public class Roupa {

    private String modelo;

    public Roupa(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    private String cor;

    @Override
    public String toString() {
        return "Roupa{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }




}
