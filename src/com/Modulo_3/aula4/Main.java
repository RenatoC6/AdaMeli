package com.Modulo_3.aula4;

import com.Modulo_3.Aula3.Armazem;
import com.Modulo_3.Aula3.Celular;

import java.time.LocalDate;

public class Main {

    public static <bollean> void main(String[] args) {

        MinhaLista<Roupa> listaRoupa = new MinhaLista("Roupa", LocalDate.now());

        Roupa roupa1 = new Roupa("Camiseta", "preta");
        listaRoupa.adicionar(roupa1);
        Roupa roupa2 = new Roupa("Calça", "azul");
        listaRoupa.adicionar(roupa2);
        Roupa roupa3 = new Roupa("Blusa", "branca");
        listaRoupa.adicionar(roupa3);

        System.out.println("metodo exibir lista: ");
        listaRoupa.exibirLista();

        System.out.println("metodo remover lista roupa 1: ");
        listaRoupa.remover(roupa1);

        boolean result = listaRoupa.buscar(roupa2);
        System.out.println("metodo buscar lista 2: " + result);

        int tam = listaRoupa.tamanho();
        System.out.println("metodo tamanho da lista: " + tam);

        System.out.println("Metodo exibir lista:");
        listaRoupa.exibirLista();

        boolean expirada = listaRoupa.estaExpirada();
        System.out.println("metodo lista expirada: " + expirada);

        // implementação dos metodos do Notebook;

        MinhaLista<Notebook> listaNotebook = new MinhaLista<>("notebook", LocalDate.now());

        Notebook notebook1 = new Notebook("Asus", "Zenbook");
        listaNotebook.adicionar(notebook1);
        Notebook notebook2 = new Notebook("Samsung", "book");
        listaNotebook.adicionar(notebook2);

        System.out.println("metodo exibir lista: ");
        listaNotebook.exibirLista();

        System.out.println("metodo remover lista notebook 1: ");
        listaNotebook.remover(notebook1);

        boolean resultNote = listaNotebook.buscar(notebook2);
        System.out.println("metodo buscar notebook 2: " + resultNote);

        int tamnote = listaNotebook.tamanho();
        System.out.println("metodo tamanho da notebook: " + tamnote);

        System.out.println("Metodo exibir lista:");
        listaNotebook.exibirLista();

        boolean expiradanote = listaNotebook.estaExpirada();
        System.out.println("metodo lista expirada: " + expiradanote);

    }
}
