package com.Modulo_1.Exercicios;

import com.Modulo_1.Exercicios.exibicao.Estoque;
import com.Modulo_1.Exercicios.vo.Produto;

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

            estoque.consultaEstoque();
            estoque.calculaValorEstoque();

            if (simNao == 1) {
                estoque.atualizaEstoque(qtdProdutos);

            }
            else {
                break;
            }


        }
    }


}
