package org.example;

import java.util.PriorityQueue;

public class SistemaSuporte {
    public static void main(String[] args) {
        PriorityQueue<Chamado> filaPrioridade = new PriorityQueue<>();

        filaPrioridade.add(new Chamado("Computador não liga", 5));
        filaPrioridade.add(new Chamado("Erro no sistema", 4));
        filaPrioridade.add(new Chamado("Troca de senha", 1));
        filaPrioridade.add(new Chamado("Internet lenta", 3));
        filaPrioridade.add(new Chamado("Instalação de software", 2));

        System.out.println("--- Ordem de Atendimento dos Chamados ---");
        while (!filaPrioridade.isEmpty()) {
            Chamado c = filaPrioridade.poll(); // Remove o chamado da fila
            System.out.println("Chamado: " + c.getDescricao() + " | Prioridade: " + c.getPrioridade());
        }
    }
}