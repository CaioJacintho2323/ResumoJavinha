package com.caiojacintho.javacore.comportamento.interfaces;

import com.caiojacintho.javacore.comportamento.dominio.Carro;

public interface CarroPredicate {
    boolean test(Carro carro);
}
