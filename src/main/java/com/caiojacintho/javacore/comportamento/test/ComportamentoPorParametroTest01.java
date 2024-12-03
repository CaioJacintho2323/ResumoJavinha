package com.caiojacintho.javacore.comportamento.test;

import com.caiojacintho.javacore.comportamento.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Carro> carros = List.of(new Carro("preto", 2024), new Carro("azul", 1998), new Carro("vermelho", 2020));


    public static void main(String[] args) {
        System.out.println(filtroDeCarroPorCor(carros, "azul"));
        System.out.println(filtroDeData(carros,2023));
    }

    private static List<Carro> filtroDeCarroPorCor(List<Carro> carros, String cor) {
        List<Carro> carrosFiltrado = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getColor().equals(cor)) {
                carrosFiltrado.add(carro);
            }
        }
        return carrosFiltrado;
    }

    private static List<Carro> filtroDeCarroPreto(List<Carro> carros) {
        List<Carro> carrosFiltrado = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getColor().equals("black")) {
                carrosFiltrado.add(carro);
            }
        }
        return carrosFiltrado;
    }

    private static List<Carro> filtroDeData(List<Carro> carros, int ano) {
        List<Carro> carrosFiltrado = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getAno() < ano) {
                carrosFiltrado.add(carro);
            }
        }
        return carrosFiltrado;
    }
}
