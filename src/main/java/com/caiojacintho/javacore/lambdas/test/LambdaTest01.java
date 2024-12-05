package com.caiojacintho.javacore.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3));
        forEach(list, s -> System.out.println(s));
        forEach(list1, s -> System.out.println(s));
    }
    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
