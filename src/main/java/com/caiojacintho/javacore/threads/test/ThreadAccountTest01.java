package com.caiojacintho.javacore.threads.test;

import com.caiojacintho.javacore.threads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();
    public static void main(String[] args) {
        ThreadAccountTest01 thread = new ThreadAccountTest01();
        Thread t1 = new Thread(thread,"caio");
        Thread t2 = new Thread(thread,"joana");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("fodeoooo");
            }
        }
    }
    private synchronized void withdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(getName() + " está indo sacar dinheiro");
            account.withdrawal(amount);
            System.out.println(getName() + " completou o saque, valor atual da conta " + account.getBalance());
        }else {
            System.out.println("sem dinheiro para " + getName() + " efetuar o saque " + account.getBalance());
        }
    }

    private static String getName() {
        return Thread.currentThread().getName();
    }


}
