package com.caiojacintho.javacore.generics.service;

import com.caiojacintho.javacore.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;
    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("buscando objeto disponivel...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("alugando objeto : " + t);
        System.out.println("objetos disponiveis : ");
        System.out.println(objetosDisponiveis);
        return t;
    }
    public void retornarObjetoAlugado(T t){
        System.out.println("devolvendo objeto" + t);
        objetosDisponiveis.add(t);
        System.out.println("objeto disponiveis : ");
        System.out.println(objetosDisponiveis);
    }
}
