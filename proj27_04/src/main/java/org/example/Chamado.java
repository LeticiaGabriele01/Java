package org.example;

class Chamado implements Comparable<Chamado> {
    private String descricao;
    private int prioridade;

    public Chamado(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }


    @Override
    public int compareTo(Chamado outro) {
        return Integer.compare(outro.prioridade, this.prioridade);
    }
    public String getDescricao() {
        return descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }
}