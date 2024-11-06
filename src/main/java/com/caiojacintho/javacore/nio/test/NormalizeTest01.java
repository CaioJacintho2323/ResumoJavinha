package com.caiojacintho.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioDoProjeto = "home/caio/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path path = Paths.get(diretorioDoProjeto, arquivoTxt);
        System.out.println(path);
        System.out.println(path.normalize());

        Path path2 = Paths.get("/home/./caio/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
