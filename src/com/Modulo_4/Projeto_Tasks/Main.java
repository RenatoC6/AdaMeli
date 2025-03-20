package com.Modulo_4.Projeto_Tasks;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefasImpl();

    while (true){
        Scanner sc = new Scanner(System.in);
        System.out.println("                                          ");
        System.out.println("============= MENU TAREFAS ===============");
        System.out.println("1. Cadastrar tarefa");
        System.out.println("2. Filtrar e Listar tarefas por Status");
        System.out.println("3. Alterar Status da Tarefa");
        System.out.println("4. Listar tarefas Ordenadas por data Limite");
        System.out.println("5. Sair");
        System.out.print("==> Digite a opção desejada: ");

        int opcao = sc.nextInt();
        sc.nextLine();
        switch (opcao) {
            case 1:
                Tarefa tarefa = cadastrarTarefa();
                gerenciador.InserirTarefaLista(tarefa);
                System.out.println("*** Tarefa cadastrada com sucesso !!! ***");
                break;
            case 2:
                StatusTarefa statusNovo = listarTarefasStatus();
                if(statusNovo != null){
                    gerenciador.listarTarefasPorStatus(statusNovo);
                }
                break;
            case 3:
                System.out.print("Digite o título da tarefa que deseja alterar o status: ");
                String tituloAlterar = sc.nextLine();
                boolean isTarefa = gerenciador.buscarTarefaPorTitulo(tituloAlterar);

                if(isTarefa) {
                    System.out.println("==> Digite o novo status da tarefa: ");
                    StatusTarefa novoStatus = listarTarefasStatus();
                    if (novoStatus != null) {
                        gerenciador.alterarStatusTarefa(tituloAlterar, novoStatus);
                    }
                }
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
                    return tarefa;

                }

            } catch (DateTimeException e) {
                System.out.println("*** Formato da data invalido (dd/MM/yy) ***");
            }

        }
    }

    public static StatusTarefa listarTarefasStatus(){
        Scanner sc = new Scanner(System.in);
        StatusTarefa statusNovo = null;

        System.out.println("==========================================");
        System.out.println("1. PENDENTE");
        System.out.println("2. EM_ANDAMENTO");
        System.out.println("3. CONCLUIDO");
        System.out.print("==> Selecione um status:");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                statusNovo = StatusTarefa.PENDENTE;
                break;
            case 2:
                statusNovo = StatusTarefa.EM_ANDAMENTO;
                break;
            case 3:
                statusNovo = StatusTarefa.CONCLUIDO;
                break;
            default:
                System.out.println("Opção inválida!");

        }
        return statusNovo;
    }

}

