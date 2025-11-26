package com.aprendizado.service;

import com.aprendizado.model.Tarefa;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> listaDeTarefas;
   //os meninos de lauro//
    public GerenciadorTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionar(String descricao) {
        if (descricao != null && !descricao.trim().isEmpty()) {
            listaDeTarefas.add(new Tarefa(descricao));
        }
    }

    public void listar() {
        if (listaDeTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
            return;
        }

        System.out.println("Lista de Tarefas ");
        for (int i = 0; i < listaDeTarefas.size(); i++) {
            System.out.println(i + ". " + listaDeTarefas.get(i));
        }
    }

    public void concluirTarefa(int indice) {
        if (indice >= 0 && indice < listaDeTarefas.size()) {
            listaDeTarefas.get(indice).concluir();
            System.out.println("Tarefa concluída com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void remover(int indice) {
        if (indice >= 0 && indice < listaDeTarefas.size()) {
            listaDeTarefas.remove(indice);
            System.out.println("Tarefa removida.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public List<Tarefa> getListaDeTarefas() {
        return listaDeTarefas;
    }
}
