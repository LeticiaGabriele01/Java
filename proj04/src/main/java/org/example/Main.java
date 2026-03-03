package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
try {
        System.out.println("Digite um numero: ");
        int a = sc.nextInt();

        System.out.println("O valor digitado é: "+ a );

        System.out.println("Digite um outro numero ");
        int b = sc.nextInt();

        int resultado = a/b;
        System.out.println("Resultado:  " + resultado);


    }catch (ArithmeticException e){
    System.out.println("Erro: Não dá para dividir por zero! " );
    }catch (Exception ex){
    System.out.println("Erro: voce precisa inserir apenas numeros");
    }
        }
            }

