package com.Modulo_1.Exercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Forca {

    public static void main(String[] args) {

        // definição da palavra secreta aleatoriamento dentro de uma lista (array) e suas caracteristicas

        String[] frutas = {"MAÇA", "LARANJA", "UVA", "BANANA", "MANGA", "AÇAI", "CARAMBOLA", "TAMARINDO", "PERA", "KIWI"};
        Random random = new Random();
        int indiceAleatorio = random.nextInt(frutas.length);

        String palavraSecreta = frutas[indiceAleatorio];
        int qtdeLetras = palavraSecreta.length();
        int qtdeTentativas = qtdeLetras * 2;
        //System.out.println("palavra secreta: " + palavraSecreta);

        System.out.println("# - VAMOS BRINCAR DE FORCA - #");
        System.out.println("---------------------------------------");
        System.out.println("Dicas:");
        System.out.println("A Palavra a ser descoberta é uma Fruta de " + qtdeLetras + " letras");
        System.out.println("Voce tera " + qtdeTentativas + " tentativas para achar a palavra secreta ");
        System.out.println("Informe somente letras MAIUSCULAS");

        String formLetras = "";
        String[] frutaSelecionada = new String[qtdeLetras];
        String[] letraAcertada = new String[qtdeLetras];

        for(int i = 0; i < qtdeLetras; i++ ){
            formLetras = formLetras + "_ " +" ";
            frutaSelecionada[i] = palavraSecreta.substring(i, i + 1);
            letraAcertada[i] = " "; // eu tive que colocar espaço nesse array por causa da passagem de parametro no metodo, que dava erro de null
        }

        System.out.println("Formato da palavra secreta: " + formLetras );

        Scanner sc = new Scanner(System.in);

        int tentativas = 1;
        String letra = "";
        int acertou = 0;
        int acertou1 = 0;
        int tentativastotal = 0;

        while(tentativas < qtdeTentativas) { // esse laço é para sair das tentativas pela qtde ou pelo acerto total da palavra

               System.out.println("---------------------------------------");

               System.out.println("Digite a letra da tentativa " + tentativas + ", e voce ainda terá " + (qtdeTentativas - tentativas) + " tentativas");
               letra = sc.nextLine();

               for (int j = 0; j < qtdeLetras; j++) {

                   if (letra.equals(frutaSelecionada[j])) {
                       letraAcertada[j] = letra;
                       acertou++;
                       acertou1++;
                   }

               }
               if(acertou1 > 0){
                   System.out.println("voce acertou " + acertou1 + " letra(s)");
               } else{
                   System.out.println("Essa letra NÃO existe na palavra secreta");
               }
               acertou1 = 0;

               montaLetras(letraAcertada, qtdeLetras); // metodo para montar a forca, a medida que as letras são digitadas

               tentativas++;
               tentativastotal = tentativas;
               if(acertou == qtdeLetras){
                   tentativas = qtdeTentativas;
           }

       }

       System.out.println("---------------------------------------");
       System.out.println("numero de letras acertadas: " + acertou + ", Com " + (tentativastotal - 1) + " tentativas");
       if (acertou == qtdeLetras) {
          System.out.println("Parabéns, voce conseguiu descobrir a palavra secreta: ");
       }  else {
          System.out.println("Voce NÃO conseguiu descobrir a palavra secreta que é: " + palavraSecreta);
       }

    }



    public static void montaLetras(String[] letraAcertada, int qtdeLetras ) {

        String montaLetras = "";

        for(int i =0; i < qtdeLetras; i++) {
            String vazio = " ";

            if(letraAcertada[i].equals(vazio))
                montaLetras = montaLetras + "_" + " ";
            else{
                montaLetras = montaLetras + letraAcertada[i] + " ";
            }

        }
        System.out.println("Forca preenchida: " + montaLetras);
    }
}
