package org.example;

import java.util.Collections;
import java.util.PriorityQueue;

public class Exemplo02 {
    public static void main(String[] args) {
        PriorityQueue<Integer>fila = new PriorityQueue<>(Collections.reverseOrder());
        fila.add(10);
        fila.add(20);
        fila.add(30);
        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }

    }
}
