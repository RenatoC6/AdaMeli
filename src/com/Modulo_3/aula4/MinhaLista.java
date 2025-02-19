package com.Modulo_3.aula4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MinhaLista <T>{

    private String nome;
    private LocalDate dataLimite;
    private List<T> elementos;

        public MinhaLista(String nome, LocalDate dataLimite) {
            this.nome = nome;
            this.dataLimite = dataLimite;
            this.elementos = new ArrayList<>();
        }

        public void adicionar (T elemento){
            this.elementos.add(elemento);
        }

        public void remover (T elemento){
            this.elementos.remove(elemento);
        }

        public boolean buscar(T elemento) {
            return this.elementos.contains(elemento);

        }

        public int tamanho (){
            return elementos.size();
        }

        public void limpar(){
            this.elementos.clear();
        }

        public void exibirLista(){
            System.out.println("nome da lista: " + this.nome + " / data Limite da lista: " + this.dataLimite);

            for (int i = 0; i < elementos.size(); i++) {
                String produtoLista = elementos.get(i).toString();

                System.out.println("metodo exibirLista: " + produtoLista);

            }

        }

        public boolean estaExpirada(){
            return LocalDate.now().isAfter(this.dataLimite);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public LocalDate getDataLimite() {
            return dataLimite;
        }

        public void setDataLimite(LocalDate dataLimite) {
            this.dataLimite = dataLimite;
        }



}
