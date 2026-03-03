package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
        }
    }

    static void preOrder(Node n) {
        if (n == null) return;
        System.out.println(n.value + " ");
        preOrder(n.left);
        preOrder(n.right);
    }

    static void inOrder(Node n) {
        if (n == null) return;
        inOrder(n.left);
        System.out.println(n.value + " ");
        inOrder(n.right);
    }

    static void postOrder(Node n) {
        if (n == null) return;
        postOrder(n.left);
        postOrder(n.right);
        System.out.println(n.value + " ");
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(5);
        root.right= new Node (15);
        root.left.left = new Node(2);
        root.right.right = new Node(7);
        root.right.right = new Node(20);

        System.out.println("PreOrder: ");
        preOrder(root);
        System.out.println();

        System.out.println("InOrder: ");
        inOrder(root);
        System.out.println();

        System.out.println("PostOrder: ");
        postOrder(root);
        System.out.println();

    }
}