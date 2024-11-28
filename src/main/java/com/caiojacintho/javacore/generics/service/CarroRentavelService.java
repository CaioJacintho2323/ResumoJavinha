package com.caiojacintho.javacore.generics.service;

import com.caiojacintho.javacore.Serializacao.dominio.Aluno;
import com.caiojacintho.javacore.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BWM"), new Carro("MERCEDES")));


    public Carro buscarCarroDisponivel() {
        System.out.println("buscando carro disponivel...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("alugando carro : " + carro);
        System.out.println("carros disponiveis : ");
        System.out.println(carrosDisponiveis);
        return carro;
    }
    public void retornarCarroAlugado(Carro  carro){
        System.out.println("devolvendo carro" + carro);
        carrosDisponiveis.add(carro);
        System.out.println("carros disponiveis : ");
        System.out.println(carrosDisponiveis);
    }
}
