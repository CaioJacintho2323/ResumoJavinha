package com.caiojacintho.javacore.regex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "caio,joana,rivanda,true,200";
        Scanner sc = new Scanner(texto);
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                System.out.println("int " + i );
            }else if (sc.hasNextBoolean()) {
                boolean b = sc.nextBoolean();
                System.out.println("boolean " + b );
            }else {
                System.out.println("String " + sc.next() );
            }
        }

    }
}
