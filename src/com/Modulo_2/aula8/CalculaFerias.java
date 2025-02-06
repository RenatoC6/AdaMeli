package com.Modulo_2.aula8;

public class CalculaFerias {

    double salario;
    double inss;

    public static double calculaFeriasCLT(double salario){

       double valorcomUmTerco = salario + (salario / 3);
       double valor_ferias = valorcomUmTerco - (valorcomUmTerco * 0.08);

        return valor_ferias;

        //valor das férias = Salário mensal + (Salário mensal / 3) - INSS (8%)

    }

    public static double calculaFeriasPJ(double salario){

        double valor_ferias = salario * 0.10;
        return valor_ferias;

        //vValor das férias = Salário mensal * 0.10
    }

    public static double calculaFeriasEstagio(double salario){

        double valor_ferias = (salario * 15) / 30;
        return valor_ferias;

        //vValor das férias = (Bolsa Auxílio * 15) / 30
    }

}
