package com.caiojacintho.javacore.optional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("a");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("------------");
        Optional<String> nameOptional = findName("c");
        String vazia = nameOptional.orElse("vazia");
        System.out.println(vazia);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }
    private static Optional<String> findName(String name){
        List<String> stringList = List.of("Caio", "Joana", "Rivanda");
        int i = stringList.indexOf(name);
        System.out.println(i);
        if(i != (-1)){
            return Optional.of(stringList.get(i));
        }
        return Optional.empty();
    }
}
