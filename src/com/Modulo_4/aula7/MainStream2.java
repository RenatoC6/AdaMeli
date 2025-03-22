package com.Modulo_4.aula7;

import com.Modulo_4.aula5.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainStream2 {

    public static void main(String[] args) {
        //abordagem funcional com Lambda
        Function<Pessoa, String> converter = pessoa -> pessoa.getName();
        Consumer<String> print = nome -> System.out.println(nome);
        // esse codigo substitui o "for" abaixo de uma forma de função
        pessoas().stream()
                .map(converter)
                .forEach(print);

        // abordagem funcional com Lambda = posso simplificar o codigo acima, como abaixo:
        pessoas().stream()
                .map(pessoa -> pessoa.getName())
                .forEach(nome -> System.out.println(nome));

        // abordagem não funcional = listar os nomes da function acima usando a variavel converter
        for (Pessoa pessoa : pessoas()){
            String name = converter.apply(pessoa);
            System.out.println(name);
        }

        // listar todas as pessoas com ano > 1985
        pessoas().stream()
                .filter(pessoa -> pessoa.getDateBirth().getYear() > 1985)
                .forEach(System.out::println);
    }



    public static List<Pessoa> pessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1L, "Alice Johnson", "1234567890", LocalDate.of(1985, 11, 15)));
        pessoas.add(new Pessoa(2L, "Bob Smith", "9876543210", LocalDate.of(1990, 5, 20)));
        pessoas.add(new Pessoa(3L, "Bob Brown", "5555555555", LocalDate.of(1975, 9, 30)));
        pessoas.add(new Pessoa(4L, "David Lee", "4444444444", LocalDate.of(1995, 2, 10)));
        pessoas.add(new Pessoa(5L, "Emily Davis", "3333333333", LocalDate.of(1988, 7, 25)));
        pessoas.add(new Pessoa(6L, "Frank Wilson", "2222222222", LocalDate.of(1970, 12, 5)));
        pessoas.add(new Pessoa(7L, "Grace Miller", "1111111111", LocalDate.of(1992, 3, 18)));
        pessoas.add(new Pessoa(8L, "Henry Baker", "0000000000", LocalDate.of(1982, 8, 7)));
        pessoas.add(new Pessoa(9L, "Isabella Green", "9999999999", LocalDate.of(1997, 4, 12)));
        pessoas.add(new Pessoa(10L, "Jack Taylor", "8888888888", LocalDate.of(1978, 6, 23)));
        pessoas.add(new Pessoa(11L, "Alice Cooper", "8888888888", LocalDate.of(1978, 7, 23)));
        return pessoas;
    }
}
