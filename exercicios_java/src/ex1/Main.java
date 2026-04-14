package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Robo robo = new Robo("R2-D2");
        robo.ligar();

        while (robo.isLigado()) {
            System.out.println("\n=== MENU DO ROBÔ ===");
            System.out.println("1 - Andar (-10 energia)");
            System.out.println("2 - Virar à Esquerda (-5 energia)");
            System.out.println("3 - Virar à Direita (-5 energia)");
            System.out.println("4 - Desligar");
            System.out.print("Escolha: ");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> robo.andar();
                case 2 -> robo.virarEsquerda();
                case 3 -> robo.virarDireita();
                case 4 -> robo.desligar();
                default -> System.out.println("Comando inválido.");
            }
        }

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
