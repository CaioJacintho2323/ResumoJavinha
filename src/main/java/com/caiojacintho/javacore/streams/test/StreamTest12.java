package com.caiojacintho.javacore.streams.test;

import com.caiojacintho.javacore.streams.dominio.Category;
import com.caiojacintho.javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
        Map<Category,List<LightNovel>> categoryLigthNovelsMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case FANTASY: fantasy.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;
                case DRAMA: romance.add(lightNovel); break;
            }
        }

        categoryLigthNovelsMap.put(Category.DRAMA,drama);
        categoryLigthNovelsMap.put(Category.FANTASY,fantasy);
        categoryLigthNovelsMap.put(Category.ROMANCE,romance);

        System.out.println(categoryLigthNovelsMap);

        System.out.println("----------");

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);

    }
}
