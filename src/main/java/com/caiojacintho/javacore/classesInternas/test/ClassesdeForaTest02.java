package com.caiojacintho.javacore.classesInternas.test;

import java.util.List;

public class ClassesdeForaTest02 {
    private String nome = "caio";

    void print( final String parametro){
        final String ultimoNome = "jacintho";
        class ClasseLocal {
           public void printLocal(){
               System.out.println(parametro);
               System.out.println(nome + " " +ultimoNome);
           }
        }
        new ClasseLocal().printLocal();
    }
    public static void main(String[] args) {
        ClassesdeForaTest02 classesdeForaTest02  = new ClassesdeForaTest02();
        classesdeForaTest02.print("----");
    }
}
