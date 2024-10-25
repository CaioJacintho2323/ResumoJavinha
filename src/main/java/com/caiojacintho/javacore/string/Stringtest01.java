package com.caiojacintho.javacore.string;

public class Stringtest01 {
    public static void main(String[] args) {
        String nome = "caio"; //String constant pool
        String nome2 = "caio";
        nome = nome.concat(" jacintho"); // nome += " jacintho"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("caio"); // 1 variavel de referência, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
