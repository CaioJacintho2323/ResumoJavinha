package com.caiojacintho.javacore.padroesdeprojeto.test;


import com.caiojacintho.javacore.allexception.exception.dominio.Pessoa;
import com.caiojacintho.javacore.padroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .FirstName("Caio")
                .LastName("Jacintho")
                .username("caiolapinadola")
                .email("jacinthocaio@gmail.com")
                .build();

        System.out.println(build);

    }
}
