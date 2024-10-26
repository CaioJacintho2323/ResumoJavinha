package com.caiojacintho.javacore.formatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("'Aracaju/SE' h:mm a");
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Aracaju/SE 1:41 PM"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
