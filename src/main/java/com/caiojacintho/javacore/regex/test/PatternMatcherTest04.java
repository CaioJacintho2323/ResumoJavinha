package com.caiojacintho.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo aquilo que nao for digito
        // \s = Espacos em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-z A-Z, dígitos, _
        // \W = Tudo o que nao for incluso no \w
        // []
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // |
        // $
        // . 1.3 = 123,133,1@3,1A3


        //String regex = "[a-zA-C]";
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        //String text = "aavdjf";
        String text2 = "DmcnHIC";
        String text3 = "12 0x 0X 0xFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text3);

        System.out.println("text:   " + text3);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("posicoes encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        int numHEX = 0x59F86A;
        System.out.println("numHex: " + numHEX);
    }
}
