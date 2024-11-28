package com.caiojacintho.javacore.generics.test;

import com.caiojacintho.javacore.generics.dominio.Carro;
import com.caiojacintho.javacore.generics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("usando o carro por 1 mes...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
