package com.caiojacintho.javacore.comportamento.test;

import com.caiojacintho.javacore.comportamento.dominio.Carro;
import com.caiojacintho.javacore.comportamento.interfaces.CarroPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Carro> carros = List.of(new Carro("preto", 2024), new Carro("azul", 1998), new Carro("vermelho", 2020));


    public static void main(String[] args) {
        List<Carro> filtroPreto = filtro(carros, carro -> carro.getColor().equals("preto"));
        List<Carro> ano = filtro(carros, carro -> carro.getAno() < 2024);
        System.out.println(ano);
        System.out.println(filtroPreto);
    }
    private static List<Carro> filtro(List<Carro> carros, CarroPredicate carroPredicate) {
        List<Carro> carrosFiltrado = new ArrayList<>();
        for (Carro carro : carros) {
            if(carroPredicate.test(carro)) {
                carrosFiltrado.add(carro);
            }
        }
        return carrosFiltrado;
    }
}
