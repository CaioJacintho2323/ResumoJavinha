package com.caiojacintho.javacore.colecoes.test;

import com.caiojacintho.javacore.colecoes.dominio.Smartphone;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>(16);
        List<String> nomes2 = new ArrayList<String>(16);
        nomes.add("caio");
        nomes.add("joana");
        nomes2.add("jose");
        nomes2.add("ze");

        nomes.addAll(nomes2);


        for(String src : nomes) {
            System.out.println(src.replace("a","d"));
        }

        System.out.println("-----------");

        nomes.add("rs");

        int size = nomes.size();

        for (int i = 0; i < size; i++) {
            nomes.add("r2");
            System.out.println(nomes.get(i));
        }

        System.out.println(nomes);

        System.out.println("----");

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);

        for (Integer num : numeros) {
            System.out.println(num);
        }
    }
}
