package com.caiojacintho.javacore.io.test;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try(FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader)) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
