package ex8;

public class Pessoa {
    private String nome;
    private String profissao;

    public Pessoa(String nome) {
        this.nome = nome;
        this.profissao = "Indefinida";
    }

    public void escolherDestino(int opcao) {
        switch (opcao) {
            case 1 -> profissao = "Médico(a)";
            case 2 -> profissao = "Engenheiro(a)";
            case 3 -> profissao = "Advogado(a)";
            case 4 -> profissao = "Professor(a)";
            case 5 -> profissao = "Programador(a)";
            default -> { System.out.println("Opção inválida!"); return; }
        }
        System.out.println(nome + " escolheu ser: " + profissao);
    }

    public String getProfissao() { return profissao; }
    public String getNome() { return nome; }
}
