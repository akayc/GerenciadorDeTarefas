//Ultimo teste

package com.ListaGerenciadora.model;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluir() {
        this.concluida = true;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return (concluida ? "[X] " : "[ ] ") + descricao;
    }
}