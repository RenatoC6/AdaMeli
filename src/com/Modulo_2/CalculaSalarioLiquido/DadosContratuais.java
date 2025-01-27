package com.Modulo_2.CalculaSalarioLiquido;

public class DadosContratuais {

    String cargo;
    double salarioBase;
    boolean valeTransporte; // true or false --> flag

    DadosContratuais(String cargo, double salarioBase, boolean valeTransporte) {

        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.valeTransporte = valeTransporte;

    }



}
