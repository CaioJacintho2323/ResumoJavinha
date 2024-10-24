package com.caiojacintho.exception;

import java.io.File;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("./teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado: " + isCriado);
            file.canRead();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
