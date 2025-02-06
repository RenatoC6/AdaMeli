package com.Modulo_2.aula8;

public class Funcionario {
    String nome;
    private double salario;
    TipoContrato tipo;

   public Funcionario(){

   }

   public Funcionario(String nome, double salario, TipoContrato tipo){
   this.salario = salario;
   this.nome = nome;
   this.tipo = tipo;

    }

    public String getNome(){

        return nome;

    }

    public double getSalario(){

        return salario;

    }

    public void setsalario(double salario) {

    }
}
