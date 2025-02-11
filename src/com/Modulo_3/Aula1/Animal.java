package com.Modulo_3.Aula1;

public class Animal {

    private String raca;
    private String nome;
    private String cor;
    private boolean disponivelParaAdocao;
    TipoAnimal tipoAnimal;

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public void comer(String comida){
        System.out.println("comendo: " + comida);
    }

    public void emitirSom(){

    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public boolean isDisponivelParaAdocao() {
        return disponivelParaAdocao;
    }

    public void setDisponivelParaAdocao(boolean disponivelParaAdocao) {
        this.disponivelParaAdocao = disponivelParaAdocao;
    }
}
