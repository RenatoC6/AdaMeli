package com.Modulo_1.Exercicios;

import java.util.Scanner;

public class ForcaBruta1 {

    public static void main(String[] args) {

        // CODIGO UTILIZANDO SENHA DE 4 NUMEROS FORMATO STRING

        Scanner numero = new Scanner(System.in);
        String pass = "";

        while(true) {
            System.out.println("Digite o numero de 4 digitos positivos, entre 0000 e 9999: ");
            pass = numero.nextLine();
            if (pass.length() == 4) {
                break;
            }
            for(int i = 0; i < pass.length(); i++){
                if(pass.charAt(i) < '0' || pass.charAt(i) > '9'){
                    System.out.println("senha invalida, tente novamente");

                }
            }
        }

        long inicio = System.currentTimeMillis();

        int numtentativas = 0;
        String senhaLocalizada = "";

        for (int i = 0; i < pass.length(); i++) {

            for (int j = 0; j < 10; j++) {
                numtentativas++;
                if (Character.forDigit(j,10) == pass.charAt(i)) {
                    senhaLocalizada = senhaLocalizada + j;
                    break;
                }
            }

        }


        System.out.println("senhas localizada: " + senhaLocalizada);

        System.out.println("numero de tentativas para encontrar o numero: " + numtentativas);

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;

        System.out.println("Tempo percorrido na procura do numero: " + tempo + " milessegundos");


    }
}
