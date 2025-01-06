package com.caiojacintho.javacore.padroesdeprojeto.test;

import com.caiojacintho.javacore.padroesdeprojeto.dominio.Aircraft;
import com.caiojacintho.javacore.padroesdeprojeto.dominio.AircraftSigletonEager;

public class AircraftSigletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AircraftTest01.bookSeat("1A");
    }
    private static void bookSeat(String seat){
        System.out.println(AircraftSigletonEager.getInstance());
        AircraftSigletonEager aircraftSigletonEager = AircraftSigletonEager.getInstance();
        System.out.println(aircraftSigletonEager.bookSeat(seat));
    }
}
