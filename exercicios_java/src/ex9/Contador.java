package ex9;

public class Contador {
    private int inicio;
    private int fim;

    public Contador(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public void contar() {
        System.out.println("Contando de " + inicio + " até " + fim + " (ignorando múltiplos de 7):\n");
        for (int i = inicio; i <= fim; i++) {
            if (i % 7 == 0) {
                System.out.println("[" + i + " - ignorado (múltiplo de 7)]");
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("\n\nContagem concluída!");
    }
}
