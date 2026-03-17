package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Encontrar um valor
        int valorBuscado = 25;
        buscar(valorBuscado);
        }

        private static void buscar (int valorBuscado) {

        //raiz
            int [] raiz = {20, 40};
        //folhas
        int [] folhaEsquerda = {5, 10, 15};
        int [] folhaMeio = {20, 25, 30};
        int [] folhaDireita = {40, 45, 50};

            System.out.println("*** Busca em árvore B+ ***");
            System.out.println("Valor proucurado: "+ valorBuscado);

            System.out.println("1. Olhando para a raiz : [20 | 40]");

            int [] folhaEscolhida;

            if(valorBuscado < raiz[0]) {
                System.out.println("2. como " + valorBuscado + " < 20, " +
                        "vamos para a folha esquerda ");
                folhaEscolhida = folhaEsquerda;
                System.out.println("3. Descendo para folha: [5, 10, 15] ");
            } else if (valorBuscado >= raiz[0] && valorBuscado < raiz[1]) {
                System.out.println("2. Como 20<= " + valorBuscado + "<40, " +
                        "vamos para a folha do meio");
                folhaEscolhida = folhaMeio;
                System.out.println("3. Descendo para folha [20, 25, 30]");
            }else {
                System.out.println("2. Como " + valorBuscado + ">= 40," +
                        "vamos para a folha da direita");
                folhaEscolhida = folhaDireita;
                System.out.println("3. Descendo para a folha: [40, 45, 50]");
            }
            System.out.println();
            boolean encontrou = false;
            for (int i = 0; i < folhaEscolhida.length; i++) {
                System.out.println("4. Verificando valor: " + folhaEscolhida[i]);
                if(folhaEscolhida[i] == valorBuscado) {
                    encontrou = true;
                    System.out.println("5. Valor não encontrado na folha ");
                }


            }
            if(!encontrou){
                System.out.println(" 5. Valor não encontrado na folha ");

            }
        }
    }
