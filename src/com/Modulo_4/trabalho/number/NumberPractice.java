package com.Modulo_4.trabalho.number;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberPractice {

    private static final Integer[] NUMBERS = {4, 1, 1, 8, 1, 7, 3, 2, 3, 4};


    public List<Integer> numbersLessThan5() {
        // Filtre todos os números que são menores que 5
        List<Integer> numbersLessFive = Arrays.stream(NUMBERS) // cria um stream a partir do array NUMBERS.
                .filter(number -> number < 5) //filtra os números que são menores que 5.
                .collect(Collectors.toList()); //coleta os números filtrados em uma lista.
        return numbersLessFive;
    }

    public Set<Integer> removeRepeatNumbers() {
        // Remova os números repetidos
        Set<Integer> numbersDistinct = Arrays.stream(NUMBERS) //cria um stream a partir do array NUMBERS.
        //   coleta os números em um conjunto (Set),
        //   que automaticamente remove os números repetidos.
                .collect(Collectors.toSet());
        return numbersDistinct;
    }

    public Integer sumAllNumbers() {
        // Calcule a soma total dos números.
        Integer sum = Arrays.stream(NUMBERS) //cria um stream a partir do array NUMBERS.
        //calcula a soma total dos números no stream.
        // O primeiro argumento 0 é o valor inicial da soma,
        // e a expressão lambda (a, b) -> a + b é a operação de soma que é
        // aplicada a cada par de números no stream.
                   .reduce(0, (a, b) -> a + b);
        return sum;
    }

    public Integer sumNumbersWithoutRepeats() {
        // Some todos os números, porém não utilize os repetidos

        //Cria um stream a partir do array NUMBERS.
        // Isso permite que os elementos do array sejam processados de forma sequencial.
        Integer somaSemRepetidos = Arrays.stream(NUMBERS)
        //Remove os elementos duplicados do stream.
        // Isso significa que apenas os números únicos serão considerados na soma.
                .distinct()
        //Converte os elementos do stream de Integer para int.
        // Isso é necessário porque o método sum() trabalha com primitivos int.
                .mapToInt(Integer::intValue)
                .sum(); // Calcula a soma de todos os elementos do stream.

        return somaSemRepetidos;
    }

    public Map<Integer, Long> countRepeatedNumber() {
        // EXTRA
        // Conte quantas vezes cada número aparece na lista. Exemplo de retorno: 4 -> 2, 1 -> 3
        Map<Integer, Long> result = Arrays.stream(NUMBERS) //cria um stream a partir do array NUMBERS.
        //agrupa os números pelo próprio valor (Function.identity())
                .collect(Collectors.groupingByConcurrent(
                        Function.identity(),
                        Collectors.counting() // e conta a frequência de cada número
                ));

        return result;
    }

}
