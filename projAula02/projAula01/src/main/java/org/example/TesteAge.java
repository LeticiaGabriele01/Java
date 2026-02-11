package org.example;

import utils.Validation;

public class TesteAge {
    public static void main(String[] args) {
        System.out.println("Eu tenho 19 anos: "+ Validation.ofLegalAge(19));
    }
}
