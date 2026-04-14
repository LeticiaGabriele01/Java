package ex5;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) { System.out.println("Valor inválido."); return; }
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado. Novo saldo: R$ %.2f%n", valor, saldo);
    }

    public void sacar(double valor) {
        if (valor <= 0) { System.out.println("Valor inválido."); return; }
        if (valor > saldo) { reclamar(); return; }
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado. Novo saldo: R$ %.2f%n", valor, saldo);
    }

    public void verSaldo() {
        System.out.printf("Titular: %s | Saldo: R$ %.2f%n", titular, saldo);
    }

    public void reclamar() {
        System.out.println("Saldo insuficiente! Você tem apenas R$ " + String.format("%.2f", saldo) + ".");
    }
}
