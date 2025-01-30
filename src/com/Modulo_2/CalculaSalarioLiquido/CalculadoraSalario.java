package com.Modulo_2.CalculaSalarioLiquido;

public class CalculadoraSalario {

    public double calcularSalario(Funcionario f1) {

        double valorDesconto;

        if (f1.dadosContratuais.salarioBase <= TabelaDeValoresDeDesconto.SALARIO_ESCALAO_1) {
            valorDesconto = f1.dadosContratuais.salarioBase * TabelaDeValoresDeDesconto.DESCONTO_ESCALAO_1;
        } else if (f1.dadosContratuais.salarioBase <= TabelaDeValoresDeDesconto.SALARIO_ESCALAO_2) {
            valorDesconto = f1.dadosContratuais.salarioBase * TabelaDeValoresDeDesconto.DESCONTO_ESCALAO_2;
        } else {
            valorDesconto = f1.dadosContratuais.salarioBase * TabelaDeValoresDeDesconto.DESCONTO_ESCALAO_3;
        }

        if (f1.dadosContratuais.salarioBase <= TabelaDeValoresDeDesconto.SALARIO_LIMITE_DESCONTO_VT && f1.dadosContratuais.valeTransporte == true) {
            valorDesconto = valorDesconto + (f1.dadosContratuais.salarioBase * TabelaDeValoresDeDesconto.DESCONTO_VT);
        }
        return valorDesconto;
    }

    public double calcularSalarioLiquido(double salarioBase, double valorDesconto){

        return salarioBase - valorDesconto;
    }
}
