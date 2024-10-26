package com.caiojacintho.javacore.datas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(1, 23);
        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime1);

        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.get(ChronoField.HOUR_OF_DAY));

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
