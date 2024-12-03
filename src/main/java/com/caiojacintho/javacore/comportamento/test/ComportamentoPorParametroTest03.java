package com.caiojacintho.javacore.comportamento.test;

import com.caiojacintho.javacore.comportamento.dominio.Carro;
import com.caiojacintho.javacore.comportamento.interfaces.CarroPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Carro> carros = List.of(new Carro("preto", 2024), new Carro("azul", 1998), new Carro("vermelho", 2020));


    public static void main(String[] args) {
        List<Carro> filtroPreto = filtro(carros, carro -> carro.getColor().equals("preto"));
        List<Carro> ano = filtro(carros, carro -> carro.getAno() < 2024);
        System.out.println(ano);
        System.out.println(filtroPreto);
        List<Integer> nums = List.of(1,2,3,4,5);
        System.out.println(filtro(nums,numero -> numero % 2 == 0));
    }
    private static <T> List<T> filtro(List<T> list, Predicate<T> predicate) {
        List<T> filtro = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                filtro.add(t);
            }
        }
        return filtro;
    }
}
