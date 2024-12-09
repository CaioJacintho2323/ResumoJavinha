package com.caiojacintho.javacore.lambdas.test;

import com.caiojacintho.javacore.lambdas.dominio.Anime;
import com.caiojacintho.javacore.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Referência a um método de instância de um objeto específico
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Java", 10), new Anime("Python", 5), new Anime("C++", 9)));
        animeList.sort(animeComparators::compareByTitleNoStatic);
        animeList.sort((a1, a2) -> animeComparators.compareByTitleNoStatic(a1,a2));
        System.out.println(animeList);

    }
}








