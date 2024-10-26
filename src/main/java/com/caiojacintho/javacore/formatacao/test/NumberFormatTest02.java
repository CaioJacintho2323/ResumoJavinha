package com.caiojacintho.javacore.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale locale = new Locale("pt", "BR");
        Locale localeUS = Locale.US;
        Locale localeIT = Locale.ITALY;
        Locale localeJP = Locale.JAPAN;

        NumberFormat [] nf = new NumberFormat[4];

        nf[0] = NumberFormat.getCurrencyInstance(locale);
        nf[1] = NumberFormat.getCurrencyInstance(localeUS);
        nf[2] = NumberFormat.getCurrencyInstance(localeIT);
        nf[3] = NumberFormat.getCurrencyInstance(localeJP);

        double valor = 1_000.2212;

        for( NumberFormat nf2 : nf){
            System.out.println(nf2.getMaximumFractionDigits());
            nf2.setMaximumFractionDigits(0);
            System.out.println(nf2.format(valor));;
        }

        String valorString = "$1,000.22";

        try {
            System.out.println(nf[1].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
