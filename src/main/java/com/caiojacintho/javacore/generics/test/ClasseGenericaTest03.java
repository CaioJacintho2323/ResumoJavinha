package com.caiojacintho.javacore.generics.test;

import com.caiojacintho.javacore.generics.dominio.Barco;
import com.caiojacintho.javacore.generics.dominio.Carro;
import com.caiojacintho.javacore.generics.service.BarcoRentavelService;
import com.caiojacintho.javacore.generics.service.CarroRentavelService;
import com.caiojacintho.javacore.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("iate")));
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BWM"), new Carro("MERCEDES")));

        RentalService<Carro> carroRentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = carroRentalService.buscarObjetoDisponivel();
        System.out.println("Usando carro por 1 mes");
        carroRentalService.retornarObjetoAlugado(carro);

        System.out.println("-----");

        RentalService<Barco> barcoRentalService = new RentalService<>(barcosDisponiveis);
        Barco barco = barcoRentalService.buscarObjetoDisponivel();
        System.out.println("Usando carro por 1 mes");
        barcoRentalService.retornarObjetoAlugado(barco);
    }
}
