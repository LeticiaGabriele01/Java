package ex9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Início: ");
        int inicio = sc.nextInt();
        System.out.print("Fim: ");
        int fim = sc.nextInt();

        Contador contador = new Contador(inicio, fim);
        contador.contar();

        sc.close();
    }
}
