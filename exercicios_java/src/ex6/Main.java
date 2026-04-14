package ex6;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== LABORATÓRIO DE EXPERIMENTOS ===\n");

        for (int i = 1; i <= 20; i++) {
            Experimento exp = new Experimento(i);
            exp.analisar();
        }
    }
}
