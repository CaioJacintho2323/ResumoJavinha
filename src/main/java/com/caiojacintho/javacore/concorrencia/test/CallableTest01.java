package com.caiojacintho.javacore.concorrencia.test;


import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String> {


    @Override
    public String call() throws Exception {
        int num = ThreadLocalRandom.current().nextInt(0, 11);
        for (int i = 0; i < num; i++) {
            System.out.printf("%s executando uma tarefa callable%n",Thread.currentThread().getName());
        }
        return String.format("%s foi finalizada e o numero aleatorio é %d", Thread.currentThread().getName(), num);
    }
}
public class CallableTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberCallable callable = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(callable);
        String s = future.get();
        System.out.printf("Programa Finalizado com sucesso %s", s);
        executorService.shutdown();


    }
}
