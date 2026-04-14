package ex6;

public class Experimento {
    private int numero;
    private String resultado;

    public Experimento(int numero) {
        this.numero = numero;
        this.resultado = "";
    }

    public void analisar() {
        if (numero % 5 == 0) {
            resultado = "INSTÁVEL";
        } else if (numero % 2 == 0) {
            resultado = "ESTÁVEL";
        } else {
            resultado = "NEUTRO";
        }
        System.out.printf("Experimento #%02d → %s%n", numero, resultado);
    }

    public String getResultado() { return resultado; }
    public int getNumero() { return numero; }
}
