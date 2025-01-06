package com.caiojacintho.javacore.concorrencia.test;

import com.caiojacintho.javacore.concorrencia.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
//        searchPriceSync(storeService);
//        searchPricesAsyncFuture(storeService);
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPriceSync(StoreService storeService){
        long startTime = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        long endTime = System.currentTimeMillis();
        System.out.printf("Tempo passado %d%n", (endTime - startTime));
    }
    private static void searchPricesAsyncFuture(StoreService storeService) {
        long startTime = System.currentTimeMillis();
        Future<Double> priceAsync1 = storeService.getPriceAsync("Store 1");
        Future<Double> priceAsync2 = storeService.getPriceAsync("Store 2");
        Future<Double> priceAsync3 = storeService.getPriceAsync("Store 3");
        Future<Double> priceAsync4 = storeService.getPriceAsync("Store 4");
        try {
            System.out.println(priceAsync1.get());
            System.out.println(priceAsync2.get());
            System.out.println(priceAsync3.get());
            System.out.println(priceAsync4.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("Tempo passado %d%n", (endTime - startTime));
        StoreService.shutdown();
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long startTime = System.currentTimeMillis();
        CompletableFuture<Double> priceAsync1 = storeService.getPriceAsyncCompletableFuture("Store 1");
        CompletableFuture<Double> priceAsync2 = storeService.getPriceAsyncCompletableFuture("Store 2");
        CompletableFuture<Double> priceAsync3 = storeService.getPriceAsyncCompletableFuture("Store 3");
        CompletableFuture<Double> priceAsync4 = storeService.getPriceAsyncCompletableFuture("Store 4");
        System.out.println(priceAsync1.join());
        System.out.println(priceAsync2.join());
        System.out.println(priceAsync3.join());
        System.out.println(priceAsync4.join());
        long endTime = System.currentTimeMillis();
        System.out.printf("Tempo passado %d%n", (endTime - startTime));
        StoreService.shutdown();
    }
}
