//atualiazacao de teste

package com.ListaGerenciadora;

import com.ListaGerenciadora.service.GerenciadorTarefas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        int opcao = 0;

        System.out.println("Bem-vindo ao seu Gerenciador de Tarefas!");

        while (opcao != 4) {
            System.out.println("\n1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Concluir Tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.next();
                System.out.println("Por favor, digite um número.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String desc = scanner.nextLine();
                    gerenciador.adicionar(desc);
                    break;
                case 2:
                    gerenciador.listar();
                    break;
                case 3:
                    gerenciador.listar();
                    System.out.print("Digite o número da tarefa para concluir: ");
                    if(scanner.hasNextInt()) {
                        int id = scanner.nextInt();
                        gerenciador.concluirTarefa(id);
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}