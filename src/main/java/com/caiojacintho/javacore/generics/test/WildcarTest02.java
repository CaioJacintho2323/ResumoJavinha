package com.caiojacintho.javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcarTest02 {
    public static void main(String[] args) {
        List<cachorro> cachorros = List.of(new cachorro(),new cachorro());
        List<gato> gatos = List.of(new gato(),new gato());
        printConsulta(cachorros);
        printConsulta(gatos);
    }
    private static void printConsulta(List<? extends animal> animals) {
        for (animal animal : animals) {
            animal.consulta();
        }

    }
}
