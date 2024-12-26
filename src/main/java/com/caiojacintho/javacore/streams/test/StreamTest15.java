package com.caiojacintho.javacore.streams.test;

import com.caiojacintho.javacore.streams.dominio.Category;
import com.caiojacintho.javacore.streams.dominio.LightNovel;
import com.caiojacintho.javacore.streams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion,
                        toCollection(LinkedHashSet::new))));
        System.out.println(collect2);


    }

    private static Promotion getPromotion(LightNovel lightNovel) {
        return lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
