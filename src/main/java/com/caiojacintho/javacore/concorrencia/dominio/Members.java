package com.caiojacintho.javacore.concorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();


    public boolean isOpen() {
        return open;
    }

    public int pedingEmails(){
        lock.lock();
        try {
            return emails.size();
        }finally {
            lock.unlock();
        }
    }

    public void addEmail(String email) {
        lock.lock();
        try {
            String name = getName();
            System.out.println(name + " adicionou email na lista");
            emails.add(email);
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
    public String retrieveEmails() throws InterruptedException {
        System.out.println(getName() + " checking if there are emails");
        lock.lock();
        try {
            while (emails.size() == 0){
                if(!open) return null;
                System.out.println(getName() + " nao tem email disponivel na lista, entrando em modo de espera");
                condition.await();
            }
            return this.emails.poll();
        }finally {
            lock.unlock();
        }
    }

    public void close(){
        open = false;
        lock.lock();
        try {
            System.out.println(getName() + " Notificando todo mundo que nao estamos mais pegando emails");
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    private static String getName() {
        return Thread.currentThread().getName();
    }
}
