package com.caiojacintho.javacore.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate date = LocalDate.of(2024, Month.DECEMBER,7);
        LocalDate date2 = LocalDate.parse("2024-12-07");
        LocalTime time = LocalTime.of(10,30,00);
        LocalTime time2 = LocalTime.parse("10:30:00");

        System.out.println(date2);
        System.out.println(time2);

        LocalDateTime localDateTime1 = date.atTime(time);
        LocalDateTime localDateTime2 = time.atDate(LocalDate.now());
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);


    }
}
