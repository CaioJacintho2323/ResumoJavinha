package com.caiojacintho.javacore.colecoes.test;

import com.caiojacintho.javacore.colecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("123", "iphone");
        Smartphone s2 = new Smartphone("123", "Samsung");

        System.out.println(s1.equals(s2));
    }
}
