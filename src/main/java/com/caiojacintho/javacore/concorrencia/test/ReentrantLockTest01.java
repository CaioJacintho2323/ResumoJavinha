package com.caiojacintho.javacore.concorrencia.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {
    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            if(lock.isHeldByCurrentThread()){
                System.out.printf("Thread %s entrou em uma sessao crítica %n", name);
            }
            System.out.printf("%d Thread esperando na fila %n", lock.getQueueLength());
            System.out.printf("Thread %s vai esperar por 2 seg %n", name);
            Thread.sleep(2000);
            System.out.printf("Thread %s finalizou a espera %n", name);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
public class ReentrantLockTest01 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
        new Thread(new Worker("A", lock)).start();
        new Thread(new Worker("B", lock)).start();
        new Thread(new Worker("C", lock)).start();
        new Thread(new Worker("D", lock)).start();
        new Thread(new Worker("E", lock)).start();
        new Thread(new Worker("F", lock)).start();
        new Thread(new Worker("G", lock)).start();
        new Thread(new Worker("H", lock)).start();
    }
}
