package com.example.aula.aulacolecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Luzia");
        nomes.add("Kamila");
        nomes.add("Kemily");
        nomes.add("Maria");
        nomes.add("Joao");

        System.out.println(nomes);

        nomes.set(2, "Larissa");

        Collections.sort(nomes);

        System.out.println(nomes);




    }
}
