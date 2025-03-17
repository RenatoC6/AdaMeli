package com.Modulo_4.aula4.exercicio.funcao;

import java.util.function.IntFunction;

public class ConversorDeInteiro implements IntFunction<String> {
    @Override
    public String apply(int value) {
        return "O Numero é: " + value;
    }
}
