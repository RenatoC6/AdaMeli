package com.Modulo_4.aula3.exercicio;

import com.Modulo_4.aula2.datetime.DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class CalculaSalario {

    public static Double calculaSalarioDia(LocalTime horaInicial, LocalTime horaFinal, Double valorHora) {

        var totalHoraDia = Duration.between(horaInicial, horaFinal);
        var totalHoraDia1 = totalHoraDia.toHours();
        double valorTotalDia = totalHoraDia1 * valorHora * 5;

        return valorTotalDia;
    }


}

