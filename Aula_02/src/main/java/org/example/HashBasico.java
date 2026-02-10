package org.example;

public class HashBasico {

    static int indice (String chave, int capacidade){
        int h = chave.hashCode();
        h = h & 0xfffffff; //deixa positivo
        return h % capacidade;
    }

    public static void main(String[] args) {

        int capacidade = 5;
        String[] chaves = { "Ana","Leo", "Maria", "joao", "Pedro"};

        for(String c : chaves){
            System.out.println(c + "-> indice "+indice(c,capacidade));
        }
    }
}
