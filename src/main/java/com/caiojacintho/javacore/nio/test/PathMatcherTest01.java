package com.caiojacintho.javacore.nio.test;

import java.nio.file.*;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/subsubarquivo1.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");

        matches(path1,"glob:**/*.{bkp,txt,java}");
        matches(path2,"glob:**/*.{bkp,txt,java}");
        matches(path3,"glob:**/*.{bkp,txt,java}");
        matches(path1,"glob:**/*.???");
        matches(path2,"glob:**/*.???");
        matches(path3,"glob:**/*.???");

    }
    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}