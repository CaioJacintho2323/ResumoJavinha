package com.caiojacintho.javacore.formatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20241025", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2024-10-25", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2024-10-25", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2024-10-25T18:27:08.204991", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("20/10/2024", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGE = LocalDate.now().format(dateTimeFormatter);
        System.out.println(formatGE);
        LocalDate parseGE = LocalDate.parse("25.Oktober.2024", dateTimeFormatter);
        System.out.println(parseGE);
    }
}