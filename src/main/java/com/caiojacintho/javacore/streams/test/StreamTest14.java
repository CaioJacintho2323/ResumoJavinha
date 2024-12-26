package com.caiojacintho.javacore.streams.test;

import com.caiojacintho.javacore.streams.dominio.Category;
import com.caiojacintho.javacore.streams.dominio.LightNovel;
import com.caiojacintho.javacore.streams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("caio", 5, Category.FANTASY),
            new LightNovel("rivanda",4,Category.ROMANCE),
            new LightNovel("cesar",3,Category.ROMANCE),
            new LightNovel("lucca", 9.00,Category.DRAMA),
            new LightNovel("caca", 2.50,Category.ROMANCE),
            new LightNovel("caca", 2.50,Category.ROMANCE),
            new LightNovel("toy", 6.00,Category.DRAMA)
    ));
    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);
        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(
                        groupingBy(LightNovel::getCategory,
                                Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

        Map<Category, LightNovel> collect3 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect3);

    }
}
