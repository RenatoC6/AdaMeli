package com.Modulo_3.aula9;

public class NotificacaoWhats implements ServicosDeNotificacao{

    @Override
    public void send(String msgs) {
        System.out.println("Notificacao por whats: " + msgs);
    }
}
