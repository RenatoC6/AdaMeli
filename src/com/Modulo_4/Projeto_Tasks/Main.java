package com.Modulo_4.Projeto_Tasks;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefasImpl();

    //Scanner sc = new Scanner(System.in);
    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    while (true){
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println("1. Cadastrar tarefa");
        System.out.println("2. Alterar Status da Tarefa");
        System.out.println("3. Filtrar tarefas por Status");
        System.out.println("4. Listar tarefas Ordenadas por data Limite");
        System.out.println("5. Sair");
        System.out.print("Digite a opção desejada: ");

        //Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        sc.nextLine();
        switch (opcao) {
            case 1:
                Tarefa tarefa = cadastrarTarefa();
                gerenciador.InserirTarefaLista(tarefa);
                System.out.println("*** Tarefa cadastrada com sucesso !!! ***");
                break;
            case 2:
                System.out.print("Digite o título da tarefa que deseja alterar o status: ");
                String tituloAlterar = sc.nextLine();
                System.out.print("Digite o novo status da tarefa (PENDENTE, EM_ANDAMENTO, CONCLUIDA): ");
                String novoStatusString = sc.nextLine();
                if(novoStatusString.equals(StatusTarefa.PENDENTE)) {
                  gerenciador.alterarStatusTarefa(tituloAlterar, StatusTarefa.PENDENTE);
                }   else if(novoStatusString.equals(StatusTarefa.EM_ANDAMENTO)){
                    gerenciador.alterarStatusTarefa(tituloAlterar, StatusTarefa.EM_ANDAMENTO);
                     }
                        else if(novoStatusString.equals(StatusTarefa.CONCLUIDO)){
                        gerenciador.alterarStatusTarefa(tituloAlterar, StatusTarefa.CONCLUIDO);
                        }
                        else System.out.println("Status Invalido");

                break;
            case 3:
                //gerenciador.listarTarefasOrdenadas();
                break;
            case 4:
                gerenciador.listarTarefasOrdenadas();
                break;
            case 5:
                System.out.println("Saindo...");
                return;
            default:
                System.out.println("*** Opção inválida! **");
        }
    }
    }

    public static Tarefa cadastrarTarefa() {

        String titulo;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.print("Digite o titulo da tarefa: ");
            titulo = sc.nextLine();
            if (titulo.length() < 10) {
                System.out.println("*** Informe um titulo com mais de 10 caracters ***");
            } else break;
        }

        System.out.print("Digite o descrição da tarefa: ");
        String descricao = sc.nextLine();

        LocalDate dataHoje = LocalDate.now();

        while (true) {
            System.out.print("Digite o data (dd/MM/yy) limite da tarefa: ");
            String dataLimiteTexto = sc.nextLine();

            try {
                LocalDate dataLimite = LocalDate.parse(dataLimiteTexto, formatter);

                if (dataLimite.isBefore(dataHoje)) {
                    System.out.println("*** Data Invalida. A Data não pode ser menor que hoje **");
                } else {

                    Tarefa tarefa = new Tarefa(titulo, descricao, dataLimite, StatusTarefa.PENDENTE);
                    //GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefasImpl();
                    //gerenciador.InserirTarefaLista(tarefa);
                    //System.out.println("*** Tarefa cadastrada com sucesso !!! ***");
                    return tarefa;

                }

            } catch (DateTimeException e) {
                System.out.println("*** Formato da data invalido (dd/MM/yy) ***");
            }

        }
    }

}

