package ex7;

public class Foguete {
    private int combustivel;
    private boolean climaBom;

    public Foguete(int combustivel, boolean climaBom) {
        this.combustivel = combustivel;
        this.climaBom = climaBom;
    }

    public void verificarLancamento() {
        System.out.println("=== VERIFICAÇÃO DE LANÇAMENTO ===");
        System.out.println("Combustível: " + combustivel + "L (mínimo: 500L)");
        System.out.println("Clima favorável: " + (climaBom ? "Sim" : "Não"));

        if (combustivel >= 500 && climaBom) {
            System.out.println("✅ Todas as condições satisfeitas. Pronto para lançar!");
            lancar();
        } else if (combustivel < 500 && !climaBom) {
            System.out.println("❌ Combustível insuficiente E clima desfavorável. Lançamento cancelado.");
        } else if (combustivel < 500) {
            System.out.println("❌ Combustível insuficiente. Lançamento cancelado.");
        } else {
            System.out.println("❌ Clima desfavorável. Lançamento cancelado.");
        }
    }

    public void lancar() {
        System.out.println("🚀 10... 9... 8... 7... 6... 5... 4... 3... 2... 1... LANÇAMENTO!");
    }
}
