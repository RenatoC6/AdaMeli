package com.Modulo_4.Projeto_Tasks;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefasImpl implements GerenciadorDeTarefas {

    private List<Tarefa> tarefas;

    public GerenciadorDeTarefasImpl() {
        this.tarefas = new ArrayList<>();
    }


    @Override
    public void InserirTarefaLista(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    public void alterarStatusTarefa(String titulo, StatusTarefa novoStatus) {
        for (Tarefa tarefas : tarefas) {
            if (tarefas.getTitulo().equals(titulo)) {
                tarefas.setStatusTarefa(novoStatus);
                System.out.println("Status da tarefa alterado com sucesso!");
                return;
            }
        }
        System.out.println("*** Tarefa não encontrada! ***");
    }


    @Override
    public void listarTarefasOrdenadas() {
        tarefas.sort((tarefa1, tarefa2) -> tarefa1.getDataLimite().compareTo(tarefa2.getDataLimite()));
        System.out.println("Tarefas: ");
        tarefas.forEach(System.out::println);

    }

    @Override
    public void listarTarefasPorStatus(StatusTarefa statusNovo) {
        int count = 0;
        System.out.println("Tarefas com status " + statusNovo + ":");
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatusTarefa() == statusNovo) {
                System.out.println(tarefa);
                count += 1;
            }
         }
        if (count == 0) {
            System.out.println("*** Não existem tarefas com esse status: " + statusNovo);
        }
    }

    @Override
    public boolean buscarTarefaPorTitulo(String titulo) {

        boolean isTarefa = false;

        for (Tarefa tarefas : tarefas) {
            if (tarefas.getTitulo().equals(titulo)) {
                System.out.println("#### Tarefa: " + tarefas.getTitulo() + " Status: " + tarefas.getStatusTarefa());
                isTarefa = true;
            } else {
                System.out.println("*** Tarefa não encontrada!");
            }
        }
        return isTarefa;

    }

}