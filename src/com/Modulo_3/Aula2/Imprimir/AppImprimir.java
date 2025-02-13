package com.Modulo_3.Aula2.Imprimir;

public class AppImprimir {

    public static void main(String[] args) {
        Imprimivel imprimiDoc = new Documento();
        Imprimivel imprimiRel = new Relatorio();

        System.out.println("=====================");
        imprimiRel.imprimir();
        System.out.println("=====================");
        imprimiDoc.imprimir();
        System.out.println("=====================");

   }
}
