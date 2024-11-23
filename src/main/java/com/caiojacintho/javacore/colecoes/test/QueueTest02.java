package com.caiojacintho.javacore.colecoes.test;

import com.caiojacintho.javacore.colecoes.dominio.Consumidor;
import com.caiojacintho.javacore.colecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(4L,"cc",95,0));
        mangas.add(new Manga(3L,"caio",100.90,1));
        mangas.add(new Manga(2L,"jo",300.50,0));
        mangas.add(new Manga(1L, "joana",600.50,15));
        mangas.add(new Manga(1L, "joana",600.50,15));
        mangas.add(new Manga(10L, "AA",600.30,15));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }


    }
}
