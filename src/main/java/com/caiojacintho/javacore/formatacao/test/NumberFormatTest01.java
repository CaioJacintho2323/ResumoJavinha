package com.caiojacintho.javacore.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale locale = new Locale("pt", "BR");
        Locale localeUS = Locale.US;
        Locale localeIT = Locale.ITALY;
        Locale localeJP = Locale.JAPAN;

        NumberFormat [] nf = new NumberFormat[4];

        nf[0] = NumberFormat.getNumberInstance(locale);
        nf[1] = NumberFormat.getNumberInstance(localeUS);
        nf[2] = NumberFormat.getNumberInstance(localeIT);
        nf[3] = NumberFormat.getNumberInstance(localeDefault);

        double valor = 10_000.22;

        for( NumberFormat nf2 : nf){
            System.out.println(nf2.format(valor));;
        }

        String valorString = "1000.221";

        try {
            System.out.println(nf[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
