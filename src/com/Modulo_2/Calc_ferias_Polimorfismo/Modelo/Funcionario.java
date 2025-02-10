package com.Modulo_2.Calc_ferias_Polimorfismo.Modelo;

public class Funcionario {

    private String nome;
    private double salario;
    private TipoFuncionario tipoFuncionario;

    public Funcionario (String nome, double salario, TipoFuncionario tipoFuncionario){
        this.nome = nome;
        this.salario = salario;
        this.tipoFuncionario = tipoFuncionario;
    }

    public String getNome() {   return nome;    }

    public double getSalario() { return salario; }

    public void setSalario(double salario) {this.salario = salario;  }

    public TipoFuncionario getTipoFuncionario() { return tipoFuncionario;  }

}
