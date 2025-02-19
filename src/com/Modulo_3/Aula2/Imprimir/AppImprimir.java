package com.Modulo_3.Aula2.Imprimir;

public class AppImprimir {

    public static void main(String[] args) {
        Imprimivel imprimiDoc = new Documento();
        impressora(imprimiDoc);
        Imprimivel imprimiRel = new Relatorio();
        impressora(imprimiRel);

    }
    public static void impressora(Imprimivel contrato) {
        System.out.println("=====================");
        System.out.println("->Iniciar a Impressora");
        contrato.imprimir();
        System.out.println("->Fim");


   }
}
