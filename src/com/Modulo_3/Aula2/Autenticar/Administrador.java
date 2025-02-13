package com.Modulo_3.Aula2.Autenticar;

public class Administrador implements Autenticavel {
    @Override
    public boolean autenticar(String password) {
        return password.equals("admin123");
    }
}
