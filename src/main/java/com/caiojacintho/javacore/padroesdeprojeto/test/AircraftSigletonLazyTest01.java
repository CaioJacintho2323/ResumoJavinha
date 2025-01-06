package com.caiojacintho.javacore.padroesdeprojeto.test;

import com.caiojacintho.javacore.padroesdeprojeto.dominio.AircraftSigletonEager;
import com.caiojacintho.javacore.padroesdeprojeto.dominio.AircraftSigletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSigletonLazyTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSigletonLazy.getInstance());
        System.out.println(AircraftSigletonLazy.getInstance());
        Constructor<AircraftSigletonLazy> construtor = AircraftSigletonLazy.class.getDeclaredConstructor(String.class);
        construtor.setAccessible(true);
        AircraftSigletonLazy aircraftSigletonLazy = construtor.newInstance("787-900");
        System.out.println(aircraftSigletonLazy);

    }
    private static void bookSeat(String seat){
        System.out.println(AircraftSigletonLazy.getInstance());
        AircraftSigletonLazy aircraftSigletonLazy = AircraftSigletonLazy.getInstance();
        System.out.println(aircraftSigletonLazy.bookSeat(seat));
    }
}
