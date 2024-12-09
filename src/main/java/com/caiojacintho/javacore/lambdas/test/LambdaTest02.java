package com.caiojacintho.javacore.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("asss", "bcc", "caio"));
        List<Integer> map = map(list, String::length);
        List<String> map1 = map(list, String::toUpperCase);
        System.out.println(map);
        System.out.println(map1);
    }
    private static <T,R> List<R> map(List<T> list, Function<T,R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R apply = function.apply(t);
            result.add(apply);
        }
        return result;
    }
}
