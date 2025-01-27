package com.Modulo_2.CalculadoraImcComPOO;

class CalculadoraIMCApp {
    public static void main(String[] args) {

        // formata as entradas na linha de comando do terminal

        String nome = ArgsUtil.getString("-n", args, "Desconhecido");
        double peso = ArgsUtil.getDouble("-p", args);
        double altura = ArgsUtil.getDouble("-a", args);
        int idade = ArgsUtil.getInt("-id", args);;

        if (peso <= 0 || altura <= 0 || idade <=0) {
            System.out.println("Erro: Todos os parâmetros devem ser fornecidos corretamente.");
            System.out.println("Uso: java CalculadoraIMC -n <nome> (opcional) -p <peso> -a <altura> -id <idade>");
            return;
        }

        Paciente p = new Paciente(nome, peso, altura, idade);
        IMC imc = CalculadoraIMC.calcular(p);

        imprimir(p, imc);

    }

    static void imprimir(Paciente p, IMC imc){
        System.out.println("---------------------------------------------------");
        System.out.println("Paciente: " + p.nome);
        System.out.println("Peso....: " + String.format("%.2f", p.peso) + " kg");
        System.out.println("Altura..: " + String.format("%.2f", p.altura) + " m");
        System.out.println("Idade...: " + String.format("%d", p.idade) + " anos");
        System.out.println("---------------------------------------------------");
        System.out.println("IMC.....: " + String.format("%.2f - %s", imc.imc, imc.getCategoria(p, imc)));
        System.out.println("---------------------------------------------------");
    }


}
