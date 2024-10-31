package com.caiojacintho.javacore.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterTest01 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try(FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("caio jacintho é foda!\nok?\n ");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
