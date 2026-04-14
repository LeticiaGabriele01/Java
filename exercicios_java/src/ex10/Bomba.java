package ex10;

import java.util.Scanner;

public class Bomba {
    private int tempo;
    private boolean armada;
    private static final int CODIGO_DESARME = 1234;

    public Bomba(int tempo) {
        this.tempo = tempo;
        this.armada = true;
    }

    public void iniciar(Scanner sc) {
        System.out.println("💣 Bomba armada! Tempo: " + tempo + "s");
        System.out.println("Código para desarmar: " + CODIGO_DESARME);
        System.out.println("(Digite 0 para deixar o tempo passar)\n");

        while (tempo > 0 && armada) {
            System.out.println("⏱  Tempo restante: " + tempo + "s");
            System.out.print("Digite o código (ou 0): ");
            int codigo = sc.nextInt();

            if (codigo != 0) {
                desarmar(codigo);
            } else {
                tempo--;
            }
        }

        if (!armada) {
            System.out.println("\n✅ Bomba desarmada com sucesso! Todos estão salvos.");
        } else {
            System.out.println("\n💥 BOOM! A bomba explodiu!");
        }
    }

    public void desarmar(int codigo) {
        if (codigo == CODIGO_DESARME) {
            armada = false;
        } else {
            System.out.println("❌ Código incorreto! Tempo continua...");
            tempo--;
        }
    }

    public boolean isArmada() { return armada; }
    public int getTempo() { return tempo; }
}
