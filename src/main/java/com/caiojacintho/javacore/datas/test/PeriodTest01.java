package com.caiojacintho.javacore.datas.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(20);
        LocalTime localTime = LocalTime.now();
        LocalTime localTimeMinus2Hours = LocalTime.now().minusHours(23).minusMinutes(19);


        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(10);
        Period p5 = Period.ofYears(3);
        Period p6 = Period.ofDays(10);

        System.out.println(p1);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p3.getMonths());
        System.out.println(Period.between(now, now.plusDays(p3.getDays())).getMonths());
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS));

    }
}
