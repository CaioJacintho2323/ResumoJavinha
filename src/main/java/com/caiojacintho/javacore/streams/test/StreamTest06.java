package com.caiojacintho.javacore.streams.test;

import com.caiojacintho.javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        System.out.println(lightNovels.stream().anyMatch(lightNovel -> lightNovel.getPrice() > 8));
        System.out.println(lightNovels.stream().allMatch(lightNovel -> lightNovel.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(lightNovel -> lightNovel.getPrice() < 0));
        lightNovels.stream()
                .filter(f -> f.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels
                .stream()
                .filter(f -> f.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);
    }
}
