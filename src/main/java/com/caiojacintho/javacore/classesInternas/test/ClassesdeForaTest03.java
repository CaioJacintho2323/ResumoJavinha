package com.caiojacintho.javacore.classesInternas.test;

public class ClassesdeForaTest03 {
    private String name = "caio";
    static class classeDeDentro{
        private String lastName = "jacintho";
        void print(){
            System.out.println(new ClassesdeForaTest03().name + " "+ lastName);
        }
    }
    public static void main(String[] args) {
        classeDeDentro classeDeDentro = new classeDeDentro();
        classeDeDentro.print();

    }
}
