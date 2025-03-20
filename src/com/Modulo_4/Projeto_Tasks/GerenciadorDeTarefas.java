package com.Modulo_4.Projeto_Tasks;

import java.time.LocalDate;

interface GerenciadorDeTarefas {
    void InserirTarefaLista(Tarefa tarefa);
    void alterarStatusTarefa(String titulo, StatusTarefa novoStatus);
    void listarTarefasOrdenadas();
    void listarTarefasPorStatus(StatusTarefa Status);
    boolean buscarTarefaPorTitulo(String titulo);

}
