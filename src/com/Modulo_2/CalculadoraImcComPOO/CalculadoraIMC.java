package com.Modulo_2.CalculadoraImcComPOO;

public class CalculadoraIMC {

    static IMC calcular(Paciente p) {
        double imc = p.peso / (p.altura * p.altura);
        return new IMC(imc);
    }

}
