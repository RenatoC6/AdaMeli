package com.Modulo_2.CalculadoraImcComPOO;

class IMC {
    double imc;

    IMC(double imc) {
        this.imc = imc;
    }

    String getCategoria(Paciente p, IMC imc) {
        if (p.idade < 18) {
            if (imc.imc < 16) {
                return "Baixo peso";
            } else if (imc.imc < 18.5) {
                return "Peso normal";
            } else if (imc.imc < 25) {
                return "Sobrepeso";
            } else {
                return "Obesidade";
            }
        } else {
            if (imc.imc < 18.5) {
                return "Baixo peso";
            } else if (imc.imc < 25) {
                return "Peso normal";
            } else if (imc.imc < 30) {
                return "Sobrepeso";
            } else {
                return "Obesidade";
            }
        }
    }

}
