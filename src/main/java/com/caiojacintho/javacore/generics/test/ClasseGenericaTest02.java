package com.caiojacintho.javacore.generics.test;

import com.caiojacintho.javacore.generics.dominio.Barco;
import com.caiojacintho.javacore.generics.dominio.Carro;
import com.caiojacintho.javacore.generics.service.BarcoRentavelService;
import com.caiojacintho.javacore.generics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("usando o barco por 1 mes...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
