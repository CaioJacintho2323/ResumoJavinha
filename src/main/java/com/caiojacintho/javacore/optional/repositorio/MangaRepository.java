package com.caiojacintho.javacore.optional.repositorio;

import com.caiojacintho.javacore.optional.domain.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Caio", 50), new Manga(2, "Rivanda", 25));


    public static Optional<Manga> findById(Integer id) {
        return findBy(s -> s.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title) {
        return findBy(s -> s.getTitle().equals(title));
    }


    public static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
