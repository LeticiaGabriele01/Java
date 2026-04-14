package ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bomba bomba = new Bomba(10);
        bomba.iniciar(sc);
        sc.close();
    }
}
