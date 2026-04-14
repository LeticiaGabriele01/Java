package ex1;

public class Robo {
    private String nome;
    private int energia;
    private boolean ligado;

    public Robo(String nome) {
        this.nome = nome;
        this.energia = 100;
        this.ligado = false;
    }

    public void ligar() {
        if (energia > 0) {
            ligado = true;
            System.out.println(nome + " ligado! Energia: " + energia);
        } else {
            System.out.println("Sem energia para ligar.");
        }
    }

    public void desligar() {
        ligado = false;
        System.out.println(nome + " desligado.");
    }

    public void andar() {
        if (!ligado) { System.out.println("Robô desligado!"); return; }
        energia -= 10;
        System.out.println(nome + " andou. Energia: " + energia);
        verificarEnergia();
    }

    public void virarEsquerda() {
        if (!ligado) { System.out.println("Robô desligado!"); return; }
        energia -= 5;
        System.out.println(nome + " virou à esquerda. Energia: " + energia);
        verificarEnergia();
    }

    public void virarDireita() {
        if (!ligado) { System.out.println("Robô desligado!"); return; }
        energia -= 5;
        System.out.println(nome + " virou à direita. Energia: " + energia);
        verificarEnergia();
    }

    private void verificarEnergia() {
        if (energia <= 0) {
            energia = 0;
            System.out.println("Energia esgotada! " + nome + " desligando automaticamente.");
            desligar();
        }
    }

    public boolean isLigado() { return ligado; }
    public int getEnergia() { return energia; }
}
