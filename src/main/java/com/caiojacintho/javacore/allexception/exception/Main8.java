package com.caiojacintho.javacore.allexception.exception;

import com.caiojacintho.javacore.allexception.exception.dominio.Leitor1;
import com.caiojacintho.javacore.allexception.exception.dominio.Leitor2;

import java.io.*;

public class Main8 {
    public static void main(String[] args) {
        lerArquivoo();
        lerArquivo();
    }

    public static void lerArquivoo(){
        try(Leitor1 l1 = new Leitor1();
            Leitor2 l2 = new Leitor2();){

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void lerArquivo(){
        try ( Reader reader = new BufferedReader(new FileReader("teste.txt"))){
            System.out.println(reader);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
