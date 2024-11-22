package com.caiojacintho.javacore.colecoes.test;

import com.caiojacintho.javacore.colecoes.dominio.Consumidor;
import com.caiojacintho.javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maptest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("caio jacintho");
        Consumidor consumidor2 = new Consumidor("joana ribeiro");

        Manga manga1 = new Manga(4L, "cc", 100.00);
        Manga manga2 = new Manga(3L,"caio",100.90);
        Manga manga3 = new Manga(2L,"jo",300.50);
        Manga manga4 = new Manga(1L, "joana",600.50);


        List<Manga> mangaConsumidorList = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidorList2 = List.of(manga3, manga4);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidorList);
        consumidorMangaMap.put(consumidor2, mangaConsumidorList2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println("---" +entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("-----" + manga.getNome());
            }
        }





    }
}
