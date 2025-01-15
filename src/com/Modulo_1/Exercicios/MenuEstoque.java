package com.Modulo_1.Exercicios;

import java.util.Scanner;


public class MenuEstoque {

      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estoque estoque = new Estoque();

        System.out.println("Digite a quantidade de produtos que deseja cadastrar: ");
        int qtdProdutos = entrada.nextInt();

        estoque.atualizaEstoque(qtdProdutos);
        estoque.consultaEstoque ();
        estoque.calculaValorEstoque();

        System.out.println ( "Deseja atualizar preços dos Produtos? 1 /p Sim - 2 p/ Não " );
        int atauPreco = entrada.nextInt();

        if (atauPreco == 1) {
            estoque.atualizaPreco();
            estoque.consultaEstoque ();
            estoque.calculaValorEstoque();
        }

        while (true) {

            System.out.println("Deseja continuar ajustando o Estoque ? 1 = Sim / 2 = Não ");
            int simNao = entrada.nextInt();

            if (simNao == 1) {
                estoque.consultaEstoque();
                estoque.calculaValorEstoque();
                estoque.atualizaEstoque(qtdProdutos);
                estoque.consultaEstoque();
                estoque.calculaValorEstoque();
            }
            else {
                break;
            }


        }
    }

        // Codigo novo refatorado em aula
    static class Estoque {
        Scanner entrada = new Scanner(System.in);
        Produto[] produtos;

        public void atualizaEstoque(int qtdProdutos ) {

            if (qtdProdutos == 0) {
                System.out.println("Digite a quantidade de produtos que deseja cadastrar: ");
                qtdProdutos = entrada.nextInt();
            }
            produtos = new Produto[qtdProdutos];

            for (int i = 0; i < produtos.length; i++) {
                Produto p = new Produto();
                entrada.nextLine();
                System.out.printf("Digite a Descrição do %d° Produto: \n", i + 1);
                p.descricao = entrada.nextLine();

                System.out.printf("Digite a Quantidade do produto: %s: \n", p.descricao);
                p.quantidade = entrada.nextInt();

                System.out.printf("Digite o Preço do produto: %s: \n", p.descricao);
                p.preco = entrada.nextDouble();
                entrada.nextLine ();
                produtos[i] = p;
            }

        }

        public void consultaEstoque() {
            System.out.println("Consulta de Estoque:");

            for (int i = 0; i < produtos.length; i++) {
                Produto p = produtos[i];
                System.out.println(p.descricao + " - Quantidade: " + p.quantidade + " - Preço: " + p.preco);
            }
        }

        public void calculaValorEstoque() {
            double valorTotal = 0;
            for (int i = 0; i < produtos.length; i++) {
                Produto p = produtos[i];
                valorTotal += p.quantidade * p.preco;
            }
            System.out.println("Valor total em estoque: " + valorTotal);
        }

        public void atualizaPreco() {
            for (int i = 0; i < produtos.length; i++) {
                Produto p = produtos[i];
                System.out.printf("Digite o novo preço do produto %s: \n", p.descricao);
                p.preco = entrada.nextDouble();
            }
        }
    }

    static class Produto {
        String descricao;
        int quantidade;
        double preco;
    }
}
