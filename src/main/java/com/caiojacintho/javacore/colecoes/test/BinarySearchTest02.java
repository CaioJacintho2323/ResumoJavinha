package com.caiojacintho.javacore.colecoes.test;

import com.caiojacintho.javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        mangas.add(new Manga(4L,"cc",100.00));
        mangas.add(new Manga(3L,"caio",100.90));
        mangas.add(new Manga(2L,"jo",300.50));
        mangas.add(new Manga(1L, "joana",600.50));


        // Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);

        for(Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(1L, "joana", 600.50);


        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));


    }
}
