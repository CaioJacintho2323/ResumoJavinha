package com.caiojacintho.javacore.io.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try (FileReader fileReader = new FileReader(file)) {
            //char [] in = new char[200];
            //int size = fileReader.read(in);
            // System.out.print(size);
            //for (char ch : in) {
            //System.out.print(ch);
            // }
            int i;
            while ((i = fileReader.read()) != -1 ){
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
