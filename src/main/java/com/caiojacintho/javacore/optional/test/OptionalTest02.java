package com.caiojacintho.javacore.optional.test;

import com.caiojacintho.javacore.optional.domain.Manga;
import com.caiojacintho.javacore.optional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> caio = MangaRepository.findByTitle("Caio");
        caio.ifPresent(manga -> manga.setTitle("Caio Jacintho"));
        System.out.println(caio);

        Manga manga = MangaRepository.findById(1).orElseThrow(IllegalArgumentException::new);
        System.out.println(manga);

        Manga orElse = MangaRepository.findByTitle("ss").orElseGet(() -> new Manga(4, "ss", 20));
        System.out.println(orElse);

    }
}
