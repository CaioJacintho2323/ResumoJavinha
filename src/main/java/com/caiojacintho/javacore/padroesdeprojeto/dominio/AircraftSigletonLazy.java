package com.caiojacintho.javacore.padroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSigletonLazy {
    private static AircraftSigletonLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftSigletonLazy(String name){
        this.name = name;
    }
    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AircraftSigletonLazy getInstance(){
        if(INSTANCE == null){
            synchronized (AircraftSigletonLazy.class){
                if(INSTANCE == null){
                    INSTANCE = new AircraftSigletonLazy("787-900");
                }
            }
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

}
