package com.caiojacintho.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/caio");
        Path clazz = Paths.get("/home/caio/devcaio/olaMundo.java");

        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto1 = Paths.get("/home/caio");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/caio/devcaio/olaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2024432");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("3 " + absoluto1.relativize(absoluto2));
        System.out.println("3 " + relativo1.relativize(relativo2));
        System.out.println("4 " + relativo2.relativize(relativo1));
        System.out.println("4 " + absoluto1.relativize(relativo1));
    }
}