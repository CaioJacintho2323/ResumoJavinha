package com.caiojacintho.javacore.datas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate now2 = LocalDate.now();
        LocalDate now3 = LocalDate.now();
        LocalDate now4 = LocalDate.now();

        now = now.plusDays(0);
        now2 = now2.minusDays(1);
        now3 = now3.withDayOfMonth(1);
        now4 = now4.with(ChronoField.DAY_OF_MONTH, 2);

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));

        System.out.println(now);
        System.out.println(now2);
        System.out.println(now3);
        System.out.println(now4);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));

        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());

        System.out.println(now);
        System.out.println(now.getDayOfMonth());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));

        System.out.println(now);
        System.out.println(now.getDayOfMonth());

    }

}
