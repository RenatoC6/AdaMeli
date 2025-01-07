package com.Modulo_1.Exercicios;

import javax.xml.transform.Source;
import java.util.Scanner;

public class ForcaBruta {

    public static void main(String[] args) {

        // CODIGO UTILIZANDO SENHA NUMERICA DE 4 DIGITOS

        Scanner numero = new Scanner(System.in);
        int pass = 0;

        while(true) {
            System.out.println("Digite o numero de 4 digitos positivos, entre 0000 e 9999: ");
            pass = numero.nextInt();
            if (pass >= 0000 && pass <= 9999) {
                break;
            }
        }

        long inicio = System.currentTimeMillis();

        int numtentativas = 0;

        for(int i = 0; i <= 9999; i++) {
            if (i == pass) {
                System.out.println("numero encontrado: " + i);
                break;
            }
        numtentativas = i;
        }

        System.out.println("numero de tentativas para encontrar o numero: " + numtentativas);

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;

        System.out.println("Tempo percorrido na procura do numero: " + tempo + " milessegundos");


    }

}
