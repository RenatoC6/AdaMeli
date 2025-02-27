package com.Modulo_3.aula6.exercicioDecoretor;

public class FormatadorTexto {

    public String formatar(String texto, String tipo) {
        if (tipo.equalsIgnoreCase("maiusculo")) {
            return texto.toUpperCase();
        } else if (tipo.equalsIgnoreCase("minusculo")) {
            return texto.toLowerCase();
        } else if (tipo.equalsIgnoreCase("asterisco")) {
            return "*" + texto + "*"; // Simula negrito
        }
        return texto;
    }
}
