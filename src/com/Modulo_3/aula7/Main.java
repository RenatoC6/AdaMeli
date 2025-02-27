package com.Modulo_3.aula7;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        System.out.println("======================");
        System.out.println("Sobre o Desenvolvedor:");
        Funcionario desenvolvedor = new Desenvolvedor();
        desenvolvedor.baterPonto();
        desenvolvedor.fazerPausa();
        desenvolvedor.trabalhar();
        desenvolvedor.programar();

        System.out.println("======================");
        System.out.println("Sobre o Gerente:");

        Funcionario gerente = new Gerente();
        gerente.trabalhar();
        gerente.atenderCliente();
        gerente.gerenciarProjeto();
        gerente.fazerPausa();
    }
}
