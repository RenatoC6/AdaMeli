package com.Modulo_3.Aula3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Crie e Adiciona Celular

        Armazem<Celular> armazenCelular = new Armazem<Celular>();
        armazenCelular.setLocalizacao("Sao Paulo");
        armazenCelular.setGerente("Maria");

        Celular celular1 = new Celular("Samsung", "S23", 1000);
        armazenCelular.armazenarProduto(celular1);
        Celular celular2 = new Celular("Apple", "Iphone 18", 2000);
        armazenCelular.armazenarProduto(celular2);

        System.out.println("===========================");
        System.out.println("Imprimindo 2 celulares adicionado-->");

        System.out.println("localização: " + armazenCelular.getLocalizacao() + " / " + "Gerente: " + armazenCelular.getGerente());
        armazenCelular.imprimelistaProdutos(armazenCelular.getTipoProdutos());

        armazenCelular.removerProdutos(celular2);

        System.out.println("===========================");
        System.out.println("Celular removido:" + celular2);

        System.out.println("===========================");
        System.out.println("Imprimindo qtde de celular atual");

        armazenCelular.imprimelistaProdutos(armazenCelular.getTipoProdutos());


        // Crie e Adiciona Televisor

        Armazem<Televisor> armazenTelevisor = new Armazem<Televisor>();
        armazenTelevisor.setLocalizacao("Floripa");
        armazenTelevisor.setGerente("Joao");

        Televisor tv1 = new Televisor("Philips", 50, 5000);
        armazenTelevisor.armazenarProduto(tv1);
        Televisor tv2 = new Televisor("Panasonic", 60, 7000);
        armazenTelevisor.armazenarProduto(tv2);

        System.out.println("===========================");
        System.out.println("Imprimindo 2 tevevisores adicionados-->");

        System.out.println("localização: " + armazenTelevisor.getLocalizacao() + " / " + "Gerente: " + armazenTelevisor.getGerente());
        armazenTelevisor.imprimelistaProdutos(armazenTelevisor.getTipoProdutos());


    }
}
