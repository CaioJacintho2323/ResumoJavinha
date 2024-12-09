package com.caiojacintho.javacore.lambdas.test;

import com.caiojacintho.javacore.lambdas.dominio.Anime;
import com.caiojacintho.javacore.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;
//Referência a um método estático
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Java", 10), new Anime("Python", 5), new Anime("C++", 9)));
        //Collections.sort(anime, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
        //Collections.sort(anime,AnimeComparators::compareByTitle);
        anime.sort(AnimeComparators::compareByEpisodes);

        System.out.println(anime);
    }
}
