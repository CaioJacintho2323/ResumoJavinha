package com.caiojacintho.javacore.streams.test;

import com.caiojacintho.javacore.streams.dominio.Category;
import com.caiojacintho.javacore.streams.dominio.LightNovel;
import com.caiojacintho.javacore.streams.dominio.Promotion;

import java.util.*;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamTest16 {
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
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongtreamIterate(num);
        sumParallelLongtreamIterate(num);
    }
    private static void sumFor(long num){
        System.out.println("sumFor");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num){
        System.out.println("sum sumStreamIterate");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    //[1,2,3,4,5,6,7,8,9,0]
    //1-[1,2,3,4,5]
    //2-[6,7,8,9]

    private static void sumParallelStreamIterate(long num){
        System.out.println("sumParallelStreamIterate");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongtreamIterate(long num){
        System.out.println("sumLongtreamIterate");
        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelLongtreamIterate(long num){
        System.out.println("sumParallelLongtreamIterate");
        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

}
