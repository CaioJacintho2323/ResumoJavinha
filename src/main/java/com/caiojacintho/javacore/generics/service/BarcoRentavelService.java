package com.caiojacintho.javacore.generics.service;

import com.caiojacintho.javacore.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha")));


    public Barco buscarbarcoDisponivel() {
        System.out.println("buscando Barco disponivel...");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("alugando Barco : " + barco);
        System.out.println("barcos disponiveis : ");
        System.out.println(barcosDisponiveis);
        return barco;
    }
    public void retornarbarcoAlugado(Barco barco){
        System.out.println("devolvendo Barco" + barco);
        barcosDisponiveis.add(barco);
        System.out.println("barcos disponiveis : ");
        System.out.println(barcosDisponiveis);
    }
}
