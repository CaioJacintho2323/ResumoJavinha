package com.caiojacintho.javacore.generics.test;

import com.caiojacintho.javacore.generics.dominio.Barco;
import com.caiojacintho.javacore.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa"));
        List<Carro> carroList= criarArrayComUmObjeto(new Carro("Fusca"));


        System.out.println(barcoList);
        System.out.println(carroList);


    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }

    //private static <T extends Comparable> List<T> criarArrayComUmObjeto(T t){
    //    return List.of(t);
    //}
}

