package com.caiojacintho.javacore.generics.test;

import com.caiojacintho.javacore.colecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");


        /*for (Object o : list) {
            if ( o instanceof String ) {
                System.out.println(o);
            }
            if ( o instanceof Consumidor ) {
                Consumidor consumidor = (Consumidor) o;
                System.out.println(consumidor);
            }*/
        for (String s : list) {
            System.out.println(s);
        }
        add(list, new Consumidor("caio jacintho"));

        for (Object s : list) {
            System.out.println(s);
        }
    }
    private static void add(List<String> list,Consumidor consumidor) {
        list.add("1");
    }
}
