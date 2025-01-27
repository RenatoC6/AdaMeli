package com.Modulo_2.CalculaSalarioLiquido;

public class Funcionario {

    DadosPessoais dadosPessoais;
    DadosContratuais dadosContratuais;

    double calcularSalario(double salarioBase, boolean valeTransporte) {

        double valorDesconto;

        if (salarioBase <= 2000.00) {
            valorDesconto = salarioBase * 0.10;
        } else if (salarioBase > 2000.00 && salarioBase <= 5000.00) {
            valorDesconto = salarioBase * 0.15;
        } else {
            valorDesconto = salarioBase * 0.20;
        }

        if (salarioBase <= 2000.00 && valeTransporte == true) {
            valorDesconto = valorDesconto + (salarioBase * 0.06);
        }
        return valorDesconto;
    }

    double calcularSalarioLiquido(double salarioBase, double valorDesconto){

        return salarioBase - valorDesconto;
    }
}
