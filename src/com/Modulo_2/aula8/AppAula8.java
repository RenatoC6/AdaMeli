package com.Modulo_2.aula8;

public class AppAula8 {

    public static void main(String[] args) {

        //CalculaFerias calc = new CalculaFerias();

        String nome1 = "joao";
        double salario1 = 3000;
        double valorFerias = 0;


        Funcionario func1 = new Funcionario(nome1, salario1, TipoContrato.CLT);
        valorFerias = CalculaFerias.calculaFeriasCLT(salario1);
        System.out.println("Nome: " + func1.getNome());
        System.out.println("tipo de contrato: " + func1.tipo);
        System.out.println("valor das ferias: " + valorFerias);

        System.out.println("===================================");

        String nome2 = "Ana";
        double salario2 = 5000;
        Funcionario func2 = new Funcionario(nome2, salario2, TipoContrato.PJ);
        valorFerias = CalculaFerias.calculaFeriasPJ(salario2);
        System.out.println("Nome: " + func2.getNome());
        System.out.println("tipo de contrato: " + func2.tipo);
        System.out.println("valor das ferias: " + valorFerias);

        System.out.println("===================================");

        String nome3 = "Lucas";
        double salario3 = 1200;
        Funcionario func3 = new Funcionario(nome3, salario3, TipoContrato.ESTAGIO);
        valorFerias = CalculaFerias.calculaFeriasEstagio(salario3);
        System.out.println("Nome: " + func3.getNome());
        System.out.println("tipo de contrato: " + func3.tipo);
        System.out.println("valor das ferias: " + valorFerias);

    }
}


//Funcionário: João
//Tipo: CLT
//Valor das férias: R$ 3.660,00