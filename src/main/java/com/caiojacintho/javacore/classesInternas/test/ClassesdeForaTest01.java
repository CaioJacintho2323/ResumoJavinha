package com.caiojacintho.javacore.classesInternas.test;

public class ClassesdeForaTest01 {
    private String nome = "caio jacintho";

    class ClasseDeDentro{
        public void imprimirAtributoDaClasseDeFora(){
            System.out.println(nome);
            System.out.println(this);
            System.out.println(ClassesdeForaTest01.this);
        }
    }
    public static void main(String[] args) {
        ClassesdeForaTest01 classesdeForaTest01 = new ClassesdeForaTest01();
        ClasseDeDentro classeDeDentro = classesdeForaTest01.new ClasseDeDentro();

        ClasseDeDentro classeDeDentro1 = new ClassesdeForaTest01().new ClasseDeDentro();

        classeDeDentro.imprimirAtributoDaClasseDeFora();
        classeDeDentro1.imprimirAtributoDaClasseDeFora();

    }
}
