package ex2;

public class Pedido {
    private double total;
    private int quantidade;
    private Pizza[] pizzas;
    private static final int MAX_PIZZAS = 5;

    public Pedido() {
        this.total = 0;
        this.quantidade = 0;
        this.pizzas = new Pizza[MAX_PIZZAS];
    }

    public void adicionarPizza(int opcao) {
        if (quantidade >= MAX_PIZZAS) {
            System.out.println("Pedido cheio! Máximo de " + MAX_PIZZAS + " pizzas.");
            return;
        }

        String sabor;
        double preco;

        switch (opcao) {
            case 1 -> { sabor = "Margherita";   preco = 35.00; }
            case 2 -> { sabor = "Calabresa";    preco = 38.00; }
            case 3 -> { sabor = "Frango";       preco = 40.00; }
            case 4 -> { sabor = "Portuguesa";   preco = 42.00; }
            case 5 -> { sabor = "Quatro Queijos"; preco = 45.00; }
            default -> {
                System.out.println("Opção inválida!");
                return;
            }
        }

        Pizza p = new Pizza(sabor, preco);
        pizzas[quantidade] = p;
        quantidade++;
        total += preco;
        System.out.println("Adicionada: " + p);
    }

    public void mostrarResumo() {
        System.out.println("\n===== RESUMO DO PEDIDO =====");
        for (int i = 0; i < quantidade; i++) {
            System.out.println((i + 1) + ". " + pizzas[i]);
        }
        System.out.printf("Total: R$ %.2f%n", total);
        System.out.println("============================");
    }

    public int getQuantidade() { return quantidade; }
}
