package com.caiojacintho.javacore.regex.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        //String text = "aavdjf";
        String text2 = "DmcnHIC";
        String text3 = "caio@hotmail.com, 123joana@gmail.com, @#$caio@mail.br, teste@gmail.com , sakura@mail";
        System.out.println("email valido:");
        System.out.println("caio@mail.br".matches(regex));

        System.out.println(Arrays.toString(text3.split(",")));

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text3);

        System.out.println("text:   " + text3);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("posicoes encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        //int numHEX = 0x59F86A;
        //System.out.println("numHex: " + numHEX);
    }
}
