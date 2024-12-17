package com.caiojacintho.javacore.streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<>();
        List<String> graphicDesigners = List.of("Lucca Jacintho", "Samia Jacintho");
        List<String> devolopers = List.of("Caio Jacintho", "Cesar Jacintho");
        List<String> students = List.of("Joana Ribeiro", "Rosa Jacintho");
        lists.add(graphicDesigners);
        lists.add(devolopers);
        lists.add(students);

        for (List<String> people : lists) {
            for (String b : people) {
                System.out.println(b);
            }
        }
        System.out.println("--------");
        lists.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
