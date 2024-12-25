package com.caiojacintho.javacore.streams.test;

import com.caiojacintho.javacore.streams.dominio.Category;
import com.caiojacintho.javacore.streams.dominio.LightNovel;
import com.caiojacintho.javacore.streams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamTest13 {
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
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream().collect(groupingBy(lightNovel -> lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
        System.out.println(collect);

        System.out.println("--------");

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels
                .stream()
                .collect(groupingBy(LightNovel::getCategory,
                        (groupingBy(lightNovel -> lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)
                )));

        System.out.println(collect1);

    }
}
