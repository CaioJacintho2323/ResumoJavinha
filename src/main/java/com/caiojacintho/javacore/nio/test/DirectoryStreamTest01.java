package com.caiojacintho.javacore.nio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get(".");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path path1 : stream) {
                System.out.println(path1.getFileName());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
