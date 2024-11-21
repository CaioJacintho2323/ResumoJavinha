package com.caiojacintho.javacore.colecoes.test;

import com.caiojacintho.javacore.colecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        //Set<Manga>mangas = new HashSet<>(); // nao permite elementos duplicados
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(4L,"cc",100.00,0));
        mangas.add(new Manga(3L,"caio",100.90,1));
        mangas.add(new Manga(2L,"jo",300.50,0));
        mangas.add(new Manga(1L, "joana",600.50,15));
        mangas.add(new Manga(1L, "joana",600.50,15));


        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
