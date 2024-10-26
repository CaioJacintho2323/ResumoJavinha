package com.caiojacintho.javacore.datas.test;

import java.util.Calendar;
import java.util.Date;

public class Calendartest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("domingo é o primeiro dia da semana");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        //calendar.add(Calendar.HOUR, 2);
        calendar.roll(Calendar.HOUR, 11);


        Date date = calendar.getTime();
        System.out.println(date);
    }
}
