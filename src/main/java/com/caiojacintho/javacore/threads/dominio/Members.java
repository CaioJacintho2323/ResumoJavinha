package com.caiojacintho.javacore.threads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;


    public boolean isOpen() {
        return open;
    }

    public int pedingEmails(){
        synchronized (this.emails) {
            return emails.size();
        }
    }

    public void addEmail(String email) {
        synchronized (this.emails) {
            String name = getName();
            System.out.println(name + " adicionou email na lista");
            emails.add(email);
            this.emails.notifyAll();
        }
    }
    public String retrieveEmails() throws InterruptedException {
        System.out.println(getName() + " checking if there are emails");
        synchronized (this.emails) {
            while (emails.size() == 0){
                if(!open) return null;
                System.out.println(getName() + " nao tem email disponivel na lista, entrando em modo de espera");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close(){
        open = false;
        synchronized (this.emails) {
            System.out.println(getName() + " Notificando todo mundo que nao estamos mais pegando emails");
        }
    }

    private static String getName() {
        return Thread.currentThread().getName();
    }
}
