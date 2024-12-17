package com.caiojacintho.javacore.streams.test;

import com.caiojacintho.javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("caio", 5),
            new LightNovel("rivanda",4),
            new LightNovel("cesar",3),
            new LightNovel("lucca", 9.00),
            new LightNovel("caca", 2.50),
            new LightNovel("caca", 2.50),
            new LightNovel("toy", 6.00)
    ));
    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = stream.filter(lightNovel -> lightNovel.getPrice() <= 4).count();
        long count1 = lightNovels.stream()
                .distinct()
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                .count();
        System.out.println(count);
        System.out.println(count1);
    }
}
