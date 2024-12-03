package com.caiojacintho.javacore.classesInternas.test;
class Animal{
    public void anda(){
        System.out.println("animal andando...");
    }
}

public class ClassesAnonimasTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void anda() {
                System.out.println("cachorro andando...");
            }
        };
        animal.anda();
    }
}
