package com.caiojacintho.javacore.colecoes.test;

import com.caiojacintho.javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>(); //melhor desempenho para remocao, seguindo o Big O
        mangas.add(new Manga(4L,"cc",100.00,0));
        mangas.add(new Manga(3L,"caio",100.90,1));
        mangas.add(new Manga(2L,"jo",300.50,0));
        mangas.add(new Manga(1L, "joana",600.50,15));

        /*Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            if (mangaIterator.next().getQuantidade() == 0){
                mangaIterator.remove();
            }
        }*/

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
