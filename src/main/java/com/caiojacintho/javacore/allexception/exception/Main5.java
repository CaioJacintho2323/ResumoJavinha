package com.caiojacintho.javacore.allexception.exception;

import java.io.File;
import java.io.IOException;

public class Main5 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("./teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
