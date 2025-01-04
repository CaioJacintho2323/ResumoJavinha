package com.caiojacintho.javacore.concorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedQueue,SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> objects = new LinkedTransferQueue<>();
        System.out.println(objects.add("Caio jacintho"));
        System.out.println(objects.offer("Caio jacintho"));
        System.out.println(objects.offer("Caio jacintho",10, TimeUnit.SECONDS));
        objects.put("Caio Mota");
        if (objects.hasWaitingConsumer()){
            objects.transfer("Caio Mota");
        }
        System.out.println(objects.tryTransfer("Caio Jc",5, TimeUnit.SECONDS));
        System.out.println(objects.element());
        System.out.println(objects.peek());
        System.out.println(objects.poll());
        System.out.println(objects.remove());
        System.out.println(objects.take());


    }
}
