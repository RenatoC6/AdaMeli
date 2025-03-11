package com.Modulo_4.aula1.solid_review;

public class Carro {

    private String modelo;

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
