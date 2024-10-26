package com.caiojacintho.javacore.datas.test;

import javax.swing.plaf.PanelUI;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime localTime = LocalTime.now();
        LocalTime localTimeMinus2Hours = LocalTime.now().minusHours(23).minusMinutes(19);

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(localTime, localTimeMinus2Hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(25);
        Duration d5 = Duration.of(3, ChronoUnit.DAYS);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
    }


}
