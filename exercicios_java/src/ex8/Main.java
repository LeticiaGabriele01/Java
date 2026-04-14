package ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        Pessoa pessoa = new Pessoa(nome);

        System.out.println("\n=== SIMULADOR DE CARREIRA ===");
        System.out.println("1 - Médico(a)");
        System.out.println("2 - Engenheiro(a)");
        System.out.println("3 - Advogado(a)");
        System.out.println("4 - Professor(a)");
        System.out.println("5 - Programador(a)");
        System.out.print("Sua escolha: ");

        pessoa.escolherDestino(sc.nextInt());
        sc.close();
    }
}
