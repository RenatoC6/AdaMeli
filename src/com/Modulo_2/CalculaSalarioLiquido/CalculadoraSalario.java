package com.Modulo_2.CalculaSalarioLiquido;

public class CalculadoraSalario {

    public double calcularSalario(Funcionario f1) {

        double valorDesconto;

        if (f1.dadosContratuais.salarioBase <= 2000.00) {
            valorDesconto = f1.dadosContratuais.salarioBase * 0.10;
        } else if (f1.dadosContratuais.salarioBase > 2000.00 && f1.dadosContratuais.salarioBase <= 5000.00) {
            valorDesconto = f1.dadosContratuais.salarioBase * 0.15;
        } else {
            valorDesconto = f1.dadosContratuais.salarioBase * 0.20;
        }

        if (f1.dadosContratuais.salarioBase <= 2000.00 && f1.dadosContratuais.valeTransporte == true) {
            valorDesconto = valorDesconto + (f1.dadosContratuais.salarioBase * 0.06);
        }
        return valorDesconto;
    }

    public double calcularSalarioLiquido(double salarioBase, double valorDesconto){

        return salarioBase - valorDesconto;
    }
}
