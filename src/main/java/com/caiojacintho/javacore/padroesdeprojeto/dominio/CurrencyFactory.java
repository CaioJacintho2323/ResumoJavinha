package com.caiojacintho.javacore.padroesdeprojeto.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case USA -> {
                return new UsDollar();
            }
            case BRASIL -> {
                return new Real();
            }
            default -> {
                throw new IllegalArgumentException("Unsupported country: " + country);
            }
        }
    };


}
