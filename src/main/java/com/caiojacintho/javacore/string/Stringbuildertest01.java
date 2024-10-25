package com.caiojacintho.javacore.string;

public class Stringbuildertest01 {
    public static void main(String[] args) {
        String nome = "Caio jacintho";
        nome.concat(" dev");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuffer sb = new StringBuffer("Caio Jacintho");
        sb.append(" dev").append(" foda");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
