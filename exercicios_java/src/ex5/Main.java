package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("João Silva", 1000.00);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n=== CAIXA ELETRÔNICO ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver Saldo");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> { System.out.print("Valor: R$ "); conta.depositar(sc.nextDouble()); }
                case 2 -> { System.out.print("Valor: R$ "); conta.sacar(sc.nextDouble()); }
                case 3 -> conta.verSaldo();
                case 4 -> System.out.println("Até logo!");
                default -> System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}
