package com.Modulo_3.Aula3;

import java.util.ArrayList;
import java.util.List;

public class Armazem <T> {

    private String localizacao;
    private String gerente;
    private List<T> produtos;

    public Armazem() {
        this.produtos = new ArrayList<>();

    }
    public void armazenarProduto(T produto){
        this.produtos.add(produto);
    }

    public void removerProdutos(T produto){
        this.produtos.remove(produto);
    }

     public void imprimelistaProdutos(List<T> produtos){

         for(int i = 0; i < produtos.size(); i++){
           String produtoLista =  produtos.get(i).toString();

           System.out.println(produtoLista);

        }

    }


    public List<T> getTipoProdutos() {
        return produtos;
    }


    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }



}