package com.Modulo_3.Aula1;

public class Pessoa {

    private String nome;
    private String telefone;
    private Animal animal;

    public void adotar(Animal animal) {
        if (animal.isDisponivelParaAdocao()) {
            this.animal = animal;
            animal.setDisponivelParaAdocao(false);
        }
    }
// isso é um construtor de Animal ???
    public Animal getAnimalAdotado(){
        return this.getAnimal();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Animal getAnimal() {
        return animal;
    }


}
