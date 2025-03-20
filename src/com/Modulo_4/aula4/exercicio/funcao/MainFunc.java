package com.Modulo_4.aula4.exercicio.funcao;

import java.util.function.*;
import java.util.stream.IntStream;

public class MainFunc {

    public static void main(String[] args) {
        for (int index = 1; index < 101; index++) {
            if (index % 2 == 0) {
                System.out.println("O número é " + index);
            }
        }

// =============================================================

        IntFunction<String> converter = new ConversorDeInteiro();
        System.out.println(converter.apply(5));

        IntFunction<String> converter2 = new IntFunction<String>() {
            // Implementação anonima
            @Override
            public String apply(int numero) {
                return "O numero é: " + numero;
            }
        };
        System.out.println(converter2.apply(5));

 // =============================================================

        // [tipo]           [nome]       [atribução de valor]
        // função = [(variaveis) -> código executável]
        IntFunction<String> converter3 = (numero) -> "O numero é: " + numero;
        System.out.println(converter3.apply(5));

        IntPredicate par = numero -> numero % 2 == 0;

        IntStream.range(1, 101)
                 .filter(par)
                 .mapToObj(converter3)
                 .forEach(System.out::println);
        }

//    // Predicate -> filtros (o retorno é um boolean que informa se a expressão foi atendida)
//    Predicate<String> nomesCom4Caracteres = (nome) -> nome.length() == 4;
//    var tem4caracteres = nomesCom4Caracteres.test("William");
//        System.out.println(tem4caracteres);
//
//    // Consumer -> recebe uma info e trabalha com ela
//    Consumer<String> imprimeNome = (nome) -> System.out.println(nome);
//        imprimeNome.accept("William César dos Santos");
//
//    // Supplier -> fornece um dado para a aplicação
//    Supplier<String> meuNome = () -> "William César dos Santos";
//        System.out.println(meuNome.get());
}
