package com.Modulo_4.aula4.exercicio.funcao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;


public class MainFunc {



    public static void main(String[] args) {

        // Dado que possuo um BigDecimal implemente a conversão para string.
        // Deve ser utilizado a interface Function
        Function<BigDecimal, String> bigDecimalConverter = (numero) -> numero.toString();

        var bigDecimal = BigDecimal.TEN;
        var text = bigDecimalConverter.apply(bigDecimal);

        System.out.println("String convertida:" + text);


// Dado que possuo uma string que representa a data no formato dd/MM/yy
        // escreva um conversor para o tipo LocalDate
        // Deve ser utilizado a interface Function

         DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");

        Function<String, LocalDate> dateConverter = (texto) -> LocalDate.parse(texto, dateFormatter);

        var date = dateConverter.apply("14/03/25");

        System.out.println("data formatada: " + date);


    }

}
