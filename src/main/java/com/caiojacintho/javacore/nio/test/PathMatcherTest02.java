package com.caiojacintho.javacore.nio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


class FindAllTestJavaOrClass extends SimpleFileVisitor<Path> {
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*Test*.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        if (matcher.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");
        Files.walkFileTree(path,new FindAllTestJavaOrClass());
    }
}
