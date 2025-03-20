package com.Modulo_4.Projeto_Tasks;

import java.time.LocalDate;

public class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataLimite;
    private StatusTarefa statusTarefa;

    public Tarefa(String titulo, String descricao, LocalDate dataLimite, StatusTarefa statusTarefa) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataLimite = dataLimite;
        this.statusTarefa = statusTarefa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public StatusTarefa getStatusTarefa() {
        return statusTarefa;
    }

    public void setStatusTarefa(StatusTarefa statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataLimite=" + dataLimite +
                ", statusTarefa=" + statusTarefa +
                '}';
    }


}
