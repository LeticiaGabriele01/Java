package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Personagem p = new Personagem("Herói");

        while (p.getVida() > 0) {
            p.mostrarStatus();
            System.out.println("\n1 - Atacar\n2 - Defender\n3 - Descansar\n4 - Sair");
            System.out.print("Ação: ");
            int acao = sc.nextInt();

            switch (acao) {
                case 1 -> { p.atacar();   p.receberDano(15); }
                case 2 -> { p.defender(); p.receberDano(5);  }
                case 3 -> p.descansar();
                case 4 -> { System.out.println("Saindo..."); return; }
                default -> System.out.println("Ação inválida.");
            }

            if (p.getVida() == 0)
                System.out.println("Game Over! " + "O personagem morreu.");
        }
        sc.close();
    }
}
