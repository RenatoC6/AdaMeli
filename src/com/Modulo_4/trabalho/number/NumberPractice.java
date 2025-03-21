package com.Modulo_4.trabalho.number;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberPractice {

    private static final Integer[] NUMBERS = {4, 1, 1, 8, 1, 7, 3, 2, 3, 4};


    public List<Integer> numbersLessThan5() {
        // Filtre todos os números que são menores que 5
        List<Integer> numbersLessFive = Arrays.stream(NUMBERS)
                .filter(number -> number < 5)
                .collect(Collectors.toList());
       return numbersLessFive;
    }

    public Set<Integer> removeRepeatNumbers() {
        // Remova os números repetidos
        Set<Integer> numbersDistinct = Arrays.stream(NUMBERS)
                .collect(Collectors.toSet());
        return numbersDistinct;
    }

    public Integer sumAllNumbers() {
        // Calcule a soma total dos números.
        Integer sum = Arrays.stream(NUMBERS)
                .reduce(0, (a, b) -> a + b);
        return sum;
    }

    public Integer sumNumbersWithoutRepeats() {
        // Some todos os números, porém não utilize os repetidos
        Integer somaSemRepetidos = Arrays.stream(NUMBERS)
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();
        return somaSemRepetidos;
    }

    public Map<Integer, Long> countRepeatedNumber() {
        // EXTRA
        // Conte quantas vezes cada número aparece na lista. Exemplo de retorno: 4 -> 2, 1 -> 3
        Map<Integer, Long> result = Arrays.stream(NUMBERS)
                .collect(Collectors.groupingByConcurrent(
                        Function.identity(),
                        Collectors.counting()
                ));
        return result;
    }

}
