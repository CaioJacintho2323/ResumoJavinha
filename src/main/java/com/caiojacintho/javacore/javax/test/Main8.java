package com.caiojacintho.javacore.javax.test;

import javax.swing.*;

public class Main8 {
    public static void main(String[] args) {
        String s1, s2;
        int n1, n2, soma;

        s1 = JOptionPane.showInputDialog("Informe um numero: ");
        s2 = JOptionPane.showInputDialog("Informe outro numero: ");

        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);

        soma = n1 + n2;

        JOptionPane.showMessageDialog(null, "Soma = " + soma, "Resultado", JOptionPane.PLAIN_MESSAGE);

    }
}
