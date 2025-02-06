package com.Modulo_2.Biblioteca;

public class Locador {

    private String nome;
    private String cpf; // poderia ser Integer? 00044158454
    private String dataDeNascimento;
    private String nomeDaMae;
    private String email;
    private String telefone;
    private String endereco;

    public Locador(String nome, String cpf, String dataDeNascimento, String nomeDaMae, String email, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.nomeDaMae = nomeDaMae;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

        public String getnome() {
            return this.nome;
        }

        public String getCpf(){
        return this.cpf;
        }

        public String getDataDeNascimento(){
        return this.dataDeNascimento;
        }

        public String getNomeDaMae(){
        return this.nomeDaMae;
    }

}
