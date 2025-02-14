package com.caiojacintho.javacore.threads.test;
class ThreadExample extends Thread {
    private final char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
        }
    }
}
class ThreadExampleRunnable implements Runnable {
    private final char c;

    public ThreadExampleRunnable(char c) {
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
// Daemon X User(O JAVA ENCERRA O PROGRAMA QUANDO TODAS A THREAD DO TIPO USER SAO ENCERRADAS)
public class ThreadsTest01 {
    public static void main(String[] args) {
        //ThreadExample threadExample = new ThreadExample('A');
        //ThreadExample threadExample1 = new ThreadExample('B');
        //ThreadExample threadExample2 = new ThreadExample('C');
        //ThreadExample threadExample3 = new ThreadExample('D');

        Thread t1 = new Thread(new ThreadExampleRunnable('A'), "T1");
        Thread t2 = new Thread(new ThreadExampleRunnable('B'),"T2");
        Thread t3 = new Thread(new ThreadExampleRunnable('C'),"T3");
        Thread t4 = new Thread(new ThreadExampleRunnable('D'),"T4");

        t4.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("###########################"+ Thread.currentThread().getName());

    }
}
