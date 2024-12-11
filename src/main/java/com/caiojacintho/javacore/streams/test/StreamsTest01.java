package com.caiojacintho.javacore.streams.test;

import com.caiojacintho.javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 1 - ordenar os mangas pelo titulo
// 2 - traga os 3 primeiros mangas que sejam menores que 4
public class StreamsTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("caio", 5),
            new LightNovel("rivanda",4),
            new LightNovel("cesar",3),
            new LightNovel("lucca", 9.00),
            new LightNovel("caca", 2.50),
            new LightNovel("toy", 6.00)
    ));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3) {
                break;
            }
        }
        System.out.println(lightNovels);
        System.out.println(titles);

    }

}
