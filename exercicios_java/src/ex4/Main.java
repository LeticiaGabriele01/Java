package ex4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Semaforo semaforo = new Semaforo();

        // 10 ciclos completos = 30 mudanças de estado (VERDE -> AMARELO -> VERMELHO = 1 ciclo)
        for (int ciclo = 1; ciclo <= 10; ciclo++) {
            System.out.println("\n=== Ciclo " + ciclo + " ===");
            for (int fase = 0; fase < 3; fase++) {
                semaforo.mostrarEstado();
                Thread.sleep(500); // pausa de 0.5s para simular o tempo
                semaforo.mudarEstado();
            }
        }
        System.out.println("\nSimulação concluída.");
    }
}
