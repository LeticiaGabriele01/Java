package org.example;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //vou utilizar a classe HashMap

        Map<String, Integer> notas = new HashMap<>();

        notas.put("Ana", 8);
        notas.put("joao", 6);
        notas.put("Maria", 4);

        //Vamos Fazer Uma Busca Utilizando o get
        System.out.println("Nota de Maria: "+notas.get("Maria"));
        System.out.println("Nota de joao "+notas.get("joao"));
        System.out.println("Nota de Ana "+notas.get("Ana"));

        //vou verificar se uma informação existe
        System.out.println("tem Ana? "+(notas.containsKey("Ana")?"Sim":"Não"));

        //atualizar o joao
        notas.put("joao", 9);
        System.out.println("Nota do João (atualizada): "+notas.get("joao"));

        //remover um item da minha tabela hash
        notas.remove("Ana");
        System.out.println("tem Ana agora "+(notas.containsKey("Ana")? "Sim": "já era....rs"));

    }
}