package org.example;

import utils.Calculate;

public class TesteOperation {

    public static  void main (String[] args){

        Calculate c = new Calculate();

        System.out.println("Soma: "+ c.sum(1, 1));
        System.out.println("Subtração: " + c.sub(10, 2));
        System.out.println("Multiplicação: "+ c.mult(2, 2));
        System.out.println("Divisão: "+ c.div(4, 2));
    }
}
