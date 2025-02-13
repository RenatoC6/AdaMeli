package com.Modulo_3.Aula2.Autenticar;

public class AppAutenticar {

    public static void main(String[] args) {

        String password = args[0];  // "admin123"
        String cpf = args[1]; // "123.456.789-00"

        Autenticavel autAdministrador = new Administrador();

        boolean aut = autAdministrador.autenticar(password);

        System.out.println("===========================");
        if(aut){
            System.out.println("Adiministrador autenticado"); }
        else{
            System.out.println("falha na autenticação do Administrador");
            }


        System.out.println("===========================");

        Autenticavel autCliente = new Cliente();

        boolean aut1 = autCliente.autenticar(cpf);

        if(aut1){
            System.out.println("CPF validado");
        }
        else{
            System.out.println("CPF invalido");
        }
        System.out.println("===========================");
    }
}
