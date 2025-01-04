package com.caiojacintho.javacore.concorrencia.service;


import com.caiojacintho.javacore.concorrencia.dominio.Members;

public class EmailDeliveryService implements Runnable {
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to deliver emails...");
        while (members.isOpen() || members.pedingEmails() > 0){
            try {
                String email = members.retrieveEmails();
                if (email == null) continue;
                System.out.println(threadName + " sending email...");
                Thread.sleep(2000);
                System.out.println(threadName + " sending email done.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("todos os emails foram enviados com sucesso");

    }
}
