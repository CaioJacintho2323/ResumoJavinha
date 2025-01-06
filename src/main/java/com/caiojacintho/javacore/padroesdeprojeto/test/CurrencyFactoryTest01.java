package com.caiojacintho.javacore.padroesdeprojeto.test;

import com.caiojacintho.javacore.padroesdeprojeto.dominio.Country;
import com.caiojacintho.javacore.padroesdeprojeto.dominio.Currency;
import com.caiojacintho.javacore.padroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRASIL);
        Currency currency2 = CurrencyFactory.newCurrency(Country.USA);

        System.out.println(currency.getSymbol());
        System.out.println(currency2.getSymbol());
    }
}
