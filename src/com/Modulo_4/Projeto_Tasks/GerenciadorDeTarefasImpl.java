package com.Modulo_4.Projeto_Tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        tarefas.stream()
                .filter(t -> t.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .ifPresentOrElse(t -> {
                            t.setStatusTarefa(novoStatus);
                            System.out.println("Status da tarefa alterado com sucesso!");
                        },
                        () -> System.out.println("*** Tarefa não encontrada! ***"));
    }

    @Override
    public void listarTarefasOrdenadas() {
        tarefas.sort((tarefa1, tarefa2) -> tarefa1.getDataLimite().compareTo(tarefa2.getDataLimite()));
        System.out.println("Tarefas: ");
        tarefas.forEach(System.out::println);

    }


    @Override
    public void listarTarefasPorStatus(StatusTarefa statusNovo) {
        System.out.println("Tarefas com status " + statusNovo + ":");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

        long count = tarefas.stream()
                .filter(t -> t.getStatusTarefa() == statusNovo)
                .peek(t -> {
                    String dataLimiteTexto = t.getDataLimite().format(formatter);
                    System.out.println("Tarefa: " + t.getTitulo() +
                            " Descricao: " + t.getDescricao() +
                            " Data Limite: " + dataLimiteTexto +
                            " Status: " + t.getStatusTarefa());
                })
                .count();

        if (count == 0) {
            System.out.println("*** Não existem tarefas com esse status: " + statusNovo);
        }
    }

    @Override
    public boolean buscarTarefaPorTitulo(String titulo) {
        List<Tarefa> encontradas = tarefas.stream()
                .filter(t -> t.getTitulo().equalsIgnoreCase(titulo))
                .collect(Collectors.toList());

        if (encontradas.isEmpty()) {
            System.out.println("*** Tarefa não encontrada!");
            return false;
        }

        encontradas.forEach(t ->
                System.out.println("#### Tarefa: " + t.getTitulo() +
                        " Status: " + t.getStatusTarefa()));

        return true;
    }

}