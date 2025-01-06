package com.caiojacintho.javacore.padroesdeprojeto.test;

import com.caiojacintho.javacore.padroesdeprojeto.dominio.AircraftSigletonLazy;
import com.caiojacintho.javacore.padroesdeprojeto.dominio.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }
    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
