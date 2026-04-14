package ex7;

public class Main {
    public static void main(String[] args) {
        // Cenário 1: tudo ok
        Foguete f1 = new Foguete(800, true);
        f1.verificarLancamento();

        System.out.println();

        // Cenário 2: sem combustível
        Foguete f2 = new Foguete(200, true);
        f2.verificarLancamento();

        System.out.println();

        // Cenário 3: clima ruim
        Foguete f3 = new Foguete(600, false);
        f3.verificarLancamento();
    }
}
