package com.caiojacintho.javacore.concorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);

        bq.put("Caio Jacintho");
        System.out.printf("%s add the value %s%n", Thread.currentThread().getName(), bq.peek());
        System.out.println("trying to add another value");
        new Thread(new removeFromQueue(bq)).start();
        bq.put("Joana Ribeiro");
        System.out.printf("%s add the value %s%n", Thread.currentThread().getName(), bq.peek());
    }

    static class removeFromQueue implements Runnable {
        private BlockingQueue<String> bq;

        public removeFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
        System.out.printf("%s going to sleep for 2 s %n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.printf("%s removing value from queue %s%n", Thread.currentThread().getName(), bq.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
