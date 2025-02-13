package com.Modulo_3.Aula2.Autenticar;

public class Cliente implements Autenticavel{
    @Override
    public boolean autenticar(String cpf) {
        return cpf.equals("123.456.789-00");
        }


}
