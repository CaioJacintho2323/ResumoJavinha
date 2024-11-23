package com.caiojacintho.javacore.colecoes.test;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }


    }
}
