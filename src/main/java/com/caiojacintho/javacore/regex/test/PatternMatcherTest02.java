package com.caiojacintho.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo aquilo que nao for digito
        // \s = Espacos em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos

        String regex = "\\D";
        //String text = "aavdjf";
        String text2 = "abababa";
        String text3 = "akj3331312";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text3);

        System.out.println("text:   " + text3);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("posicoes encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
