package com.caiojacintho.javacore.colecoes.test;

import com.caiojacintho.javacore.colecoes.dominio.Manga;
import com.caiojacintho.javacore.colecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {



    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());

        Smartphone smartphone = new Smartphone("123", "nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(4L,"cc",95,0));
        mangas.add(new Manga(3L,"caio",100.90,1));
        mangas.add(new Manga(2L,"jo",300.50,0));
        mangas.add(new Manga(1L, "joana",600.50,15));
        mangas.add(new Manga(1L, "joana",600.50,15));
        mangas.add(new Manga(10L, "AA",600.30,15));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        //lower
        //flor
        //higher
        //ceiling

        Manga lucca = new Manga(21L, "lucca", 100.90, 12);
        System.out.println("---------");

        System.out.println(mangas.lower(lucca));
        System.out.println(mangas.floor(lucca));
        System.out.println(mangas.higher(lucca));
        System.out.println(mangas.ceiling(lucca));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());


    }
}
