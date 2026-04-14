package ex3;

public class Personagem {
    private String nome;
    private int vida;
    private int energia;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.energia = 100;
    }

    public void atacar() {
        if (energia < 20) { System.out.println("Energia insuficiente para atacar!"); return; }
        energia -= 20;
        System.out.println(nome + " atacou! Energia: " + energia);
    }

    public void defender() {
        if (energia < 10) { System.out.println("Energia insuficiente para defender!"); return; }
        energia -= 10;
        System.out.println(nome + " defendeu! Energia: " + energia);
    }

    public void descansar() {
        vida = Math.min(vida + 15, 100);
        energia = Math.min(energia + 30, 100);
        System.out.println(nome + " descansou. Vida: " + vida + " | Energia: " + energia);
    }

    public void mostrarStatus() {
        System.out.println("\n--- Status de " + nome + " ---");
        System.out.println("Vida:   " + vida);
        System.out.println("Energia:" + energia);
    }

    public int getVida() { return vida; }
    public void receberDano(int dano) { vida = Math.max(vida - dano, 0); }
}
