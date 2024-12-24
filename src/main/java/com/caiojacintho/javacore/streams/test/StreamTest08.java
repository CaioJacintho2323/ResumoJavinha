package com.caiojacintho.javacore.streams.test;

import com.caiojacintho.javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
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
        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .map(LightNovel::getPrice)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream()//Stream<Double>
                .mapToDouble(LightNovel::getPrice)
                .filter(f -> f > 3)
                .sum();



    }
}
