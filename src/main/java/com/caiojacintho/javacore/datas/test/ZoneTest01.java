package com.caiojacintho.javacore.datas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        System.out.println(zoneId);

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(zoneId);
        System.out.println(zonedDateTime);


        Instant instant = Instant.now();
        System.out.println(instant);

        ZonedDateTime zonedDateTime1 = instant.atZone(zoneId);//zone
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset zoneOffset = ZoneOffset.of("-04:00");//offset
        System.out.println(zoneOffset);

        OffsetDateTime offsetDateTime = now.atOffset(zoneOffset);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, zoneOffset);
        System.out.println(offsetDateTime1);


        OffsetDateTime offsetDateTime2 = instant.atOffset(zoneOffset);
        System.out.println(offsetDateTime2);

        JapaneseDate from = JapaneseDate.from(LocalDate.now());
        System.out.println(from);
    }
}
