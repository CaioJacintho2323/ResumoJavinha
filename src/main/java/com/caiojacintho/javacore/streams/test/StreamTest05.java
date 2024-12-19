package com.caiojacintho.javacore.streams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("GO", "MI", "C", "MI");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        System.out.println("-------");

        List<String[]> collect = words.stream().map(w -> w.split("")).collect(Collectors.toList());
        Stream<String> stream = Arrays.stream(letters);
        List<String> letters1 = words.stream()
                .map(w -> w.split(""))// Stream<String[]>
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());// Stream <String>
        System.out.println(letters1);
    }
}
