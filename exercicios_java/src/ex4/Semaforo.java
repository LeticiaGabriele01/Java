package ex4;

public class Semaforo {
    private String estado;

    public Semaforo() {
        this.estado = "VERDE";
    }

    public void mudarEstado() {
        switch (estado) {
            case "VERDE"    -> estado = "AMARELO";
            case "AMARELO"  -> estado = "VERMELHO";
            case "VERMELHO" -> estado = "VERDE";
        }
    }

    public void mostrarEstado() {
        String icone = switch (estado) {
            case "VERDE"    -> "🟢";
            case "AMARELO"  -> "🟡";
            case "VERMELHO" -> "🔴";
            default         -> "?";
        };
        System.out.println("Semáforo: " + icone + " " + estado);
    }

    public String getEstado() { return estado; }
}
