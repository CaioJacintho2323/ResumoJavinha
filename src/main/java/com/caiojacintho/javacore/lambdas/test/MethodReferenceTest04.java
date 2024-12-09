package com.caiojacintho.javacore.lambdas.test;

import com.caiojacintho.javacore.lambdas.dominio.Anime;
import com.caiojacintho.javacore.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Java", 10), new Anime("Python", 5), new Anime("C++", 9)));
        animeList.sort(animeComparators::compareByTitleNoStatic);
        System.out.println(animeList);

        BiFunction<String,Integer, Anime> animeBiFunction = (title,episodes) -> new Anime(title, episodes);
        BiFunction<String,Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction.apply("Java", 10));

    }
}
