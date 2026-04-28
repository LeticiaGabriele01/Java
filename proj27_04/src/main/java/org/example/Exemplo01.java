package org.example;

import java.util.PriorityQueue;

public class Exemplo01 {
    public static void main(String[] args){
        PriorityQueue<Integer> fila = new PriorityQueue<>();
        fila.add(30);
        fila.add(10);
        fila.add(20);

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }
}
