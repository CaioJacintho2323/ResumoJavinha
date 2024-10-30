package com.caiojacintho.javacore.regex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "caio, joana , rivanda, true, 200";
        String[] split = texto.split(",");
        for (String s : split) {
            System.out.println(s.trim());
        }

    }
}
