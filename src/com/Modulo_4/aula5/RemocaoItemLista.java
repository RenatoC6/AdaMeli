package com.Modulo_4.aula5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class RemocaoItemLista {
    public static void main(String[] args) {
        List<Pessoa> pessoas = pessoas();
        // Filtre as pessoas com menos de 4 caracteres no primeiro nome
        // e as remova da lista.

        Predicate<Pessoa> primeiroNome = pessoa -> pessoa.getName().split(" ")[0].length() < 4;
        pessoas.removeIf(primeiroNome);

        // dado que tenho a lista de pessoas, ordene por data de nascimento, na forma crescente

        pessoas.sort((pessoa1, pessoa2) -> pessoa1.getDateBirth().compareTo(pessoa2.getDateBirth()));

        pessoas.forEach(System.out::println);
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
        return pessoas;
    }

}
