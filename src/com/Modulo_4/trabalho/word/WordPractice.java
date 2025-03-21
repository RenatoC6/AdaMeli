package com.Modulo_4.trabalho.word;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordPractice {

    private static final String[] WORDS = {"Arroz", "Feijão", "Ovo", "Frito", "Radar", "Osso"};

    public List<String> wordsLessThan5Characters() {
        //Filtre apenas palavras que possuem menos de 5 caracteres
        List<String> wordLessFive = Arrays.stream(WORDS)
                .filter(word -> word.length() < 5)
                .collect(Collectors.toList());

        return wordLessFive;
    }
    public List<String> words5Characters() {
        // Filtre apenas palavras que possuem 5 caracteres
        List<String> wordFive = Arrays.stream(WORDS)
                .filter(words -> words.length() == 5)
                .collect(Collectors.toList());
        return wordFive;

    }

    public List<String> wordsGreaterThan5Characters() {
        // Filtre apenas palavras que possuem mais de 5 caracteres
        List<String> wordThanFive = Arrays.stream(WORDS)
                .filter(words -> words.length() > 5)
                .collect(Collectors.toList());
        return wordThanFive;
    }

    public List<String> wordsArePalindromes() {
        // Identifique e retorne as palavras que sejam palíndromos(são iguais de trás para frente, exemplo: Radar)
        List<String> palindromes = Arrays.stream(WORDS)
                .filter(word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
                .collect(Collectors.toList());

        return palindromes;
    }

    public Map<String, Integer> countLetterEachWord() {
        //EXTRA
        //Calcule quantos caracteres cada palavra têm, o retorno deve ser a palavra -> quantidade de carateres. Exemplo: Osso -> 4
        Map<String, Integer> caractersWord = Arrays.stream(WORDS)
                .collect(Collectors.toMap(
                        Function.identity(),
                        String::length
                ));

        return caractersWord;
    }


    public Integer countLettersAllWordHave() {
        // EXTRA
        // Calcule quantos caracteres tem todas as palavras têm juntas.
        Integer lettersAllWord = Arrays.stream(WORDS)
                .mapToInt(String::length)
                .sum();

        return lettersAllWord;
    }

}
