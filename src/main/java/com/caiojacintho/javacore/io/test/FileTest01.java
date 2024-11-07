package com.caiojacintho.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("subsubarquivo1.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("caminho " + file.getPath());
            System.out.println("caminho absoluto " + file.getAbsolutePath());
            System.out.println(" é pasta " + file.isDirectory());
            System.out.println("é arquivo " + file.isFile());
            System.out.println("é oculto " + file.isHidden());
            System.out.println("ultima modificacao " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
            System.out.println("criado " + isCreated);
            boolean exists = file.exists();
            if (exists) {
                System.out.println("deletado " + file.delete());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
