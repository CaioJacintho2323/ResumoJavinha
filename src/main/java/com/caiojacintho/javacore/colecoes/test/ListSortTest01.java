package com.caiojacintho.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(6);
        nomes.add("caio");
        nomes.add("joana");
        nomes.add("cesar");
        nomes.add("rivanda");

        Collections.sort(nomes);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(1.55);
        dinheiros.add(2.40);
        dinheiros.add(3.99);
        dinheiros.add(4.10);

        Collections.sort(dinheiros);


        for (String nome : nomes) {
            System.out.println(nome);
        }

        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }
    }
}
