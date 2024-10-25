package com.caiojacintho.javacore.allexception.runtime;

import java.io.IOException;

public class Main6 {
    public static void main(String[] args) {
        abrindoConexao();
    }

    private static String abrindoConexao() {
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo dados no arquivo");
            return "conexao aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("fechando recurso liderado pelo sistema operacional");
        }
        return null;
    }
    private static void abrindoConexao2() {
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo dados no arquivo");
        } finally {
            System.out.println("fechando recurso liderado pelo sistema operacional");
        }
    }
}
