package com.caiojacintho.javacore.padroesdeprojeto.test;

import com.caiojacintho.javacore.padroesdeprojeto.dominio.Aircraft;
import com.caiojacintho.javacore.padroesdeprojeto.dominio.AircraftSigletonEager;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }
    static void bookSeat(String seat){
        System.out.println(AircraftSigletonEager.getInstance());
        Aircraft aircraft = new Aircraft("777");
        System.out.println(aircraft.bookSeat(seat));
    }
}
