package com.caiojacintho.javacore.streams.test;

import com.caiojacintho.javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("caio", 5),
            new LightNovel("rivanda",4),
            new LightNovel("cesar",3),
            new LightNovel("lucca", 9.00),
            new LightNovel("caca", 2.50),
            new LightNovel("toy", 6.00)
    ));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(p -> p.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);

    }

}
