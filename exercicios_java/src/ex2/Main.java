package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pedido pedido = new Pedido();

        System.out.println("Quantas pizzas deseja pedir? (máx. 5)");
        int n = Math.min(sc.nextInt(), 5);

        for (int i = 0; i < n; i++) {
            System.out.println("\n=== CARDÁPIO ===");
            System.out.println("1 - Margherita   R$ 35,00");
            System.out.println("2 - Calabresa    R$ 38,00");
            System.out.println("3 - Frango       R$ 40,00");
            System.out.println("4 - Portuguesa   R$ 42,00");
            System.out.println("5 - Quatro Queijos R$ 45,00");
            System.out.print("Pizza " + (i + 1) + ": ");
            pedido.adicionarPizza(sc.nextInt());
        }

        pedido.mostrarResumo();
        sc.close();
    }
}
