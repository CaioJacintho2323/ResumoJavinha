package com.caiojacintho.javacore.io.test;

import java.io.File;
import java.io.IOException;

public class Filetest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean mkdir = fileDiretorio.mkdir();
        System.out.println(mkdir);

        File fileArquivo = new File(fileDiretorio,"arquivo.txt");
        boolean newFile = fileArquivo.createNewFile();
        System.out.println(newFile);

        File fileRenamed = new File(fileDiretorio,"arquivo2.txt");
        boolean rename = fileArquivo.renameTo(fileRenamed);
        System.out.println(rename);

        File diretorioRenamed = new File("pasta2");
        boolean rename1 = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(rename1);

    }
}
