package com.caiojacintho.javacore.lambdas.service;

import com.caiojacintho.javacore.lambdas.dominio.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime anime1, Anime anime2) {
        return anime1.getTitle().compareTo(anime2.getTitle());
    }

    public static int compareByEpisodes(Anime anime1, Anime anime2) {
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }

    public int compareByTitleNoStatic(Anime anime1, Anime anime2) {
        return anime1.getTitle().compareTo(anime2.getTitle());
    }



}
