package com.caiojacintho.javacore.colecoes.test;

import com.caiojacintho.javacore.colecoes.dominio.Consumidor;
import com.caiojacintho.javacore.colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class Maptest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("caio jacintho");
        Consumidor consumidor2 = new Consumidor("joana ribeiro");

        Manga manga1 = new Manga(4L, "cc", 100.00);
        Manga manga2 = new Manga(3L,"caio",100.90);
        Manga manga3 = new Manga(2L,"jo",300.50);
        Manga manga4 = new Manga(1L, "joana",600.50);

        Map<Consumidor,Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1,manga1);
        consumidorManga.put(consumidor2,manga4);

        for (Map.Entry<Consumidor,Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " : " + entry.getValue().getNome());
        }


    }
}
