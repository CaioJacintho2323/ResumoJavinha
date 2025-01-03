package com.caiojacintho.javacore.threads.test;

import com.caiojacintho.javacore.threads.dominio.Members;
import com.caiojacintho.javacore.threads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread caio = new Thread(new EmailDeliveryService(members), "Caio");
        Thread joana = new Thread(new EmailDeliveryService(members), "Joana");
        caio.start();
        joana.start();
        while (true){
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addEmail(email);
        }
    }
}