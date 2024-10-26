package com.caiojacintho.javacore.formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Localetest01 {
    public static void main(String[] args) {
        Locale localeitaly = new Locale("it", "IT");
        Locale localeSuica = new Locale("it", "CH");
        Locale localeFrance = new Locale("fr", "FR");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeChina = new Locale("zh", "CN");
        Locale localeBrazil = new Locale("pt", "BR");
        String oi = "Ola mundo";

        Calendar calendar = Calendar.getInstance();
        DateFormat format = DateFormat.getDateInstance(DateFormat.FULL, localeitaly);
        String format1 = DateFormat.getDateInstance(DateFormat.FULL, localeSuica).format(calendar.getTime());
        String format2 = DateFormat.getDateInstance(DateFormat.FULL, localeFrance).format(calendar.getTime());
        String format3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia).format(calendar.getTime());
        String format4 = DateFormat.getDateInstance(DateFormat.FULL, localeChina).format(calendar.getTime());
        String format5 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil).format(calendar.getTime());




        System.out.println("Italia : " + format);
        System.out.println("Suica: " + format1);
        System.out.println("France : " + format2);
        System.out.println("India : " + format3);
        System.out.println("China : " + format4);
        System.out.println("Brazil : " + format5);

        System.out.println(localeitaly.getDisplayCountry(localeFrance));
        System.out.println(localeIndia.getDisplayCountry(localeFrance));





    }

}
