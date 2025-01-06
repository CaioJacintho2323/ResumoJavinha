package com.caiojacintho.javacore.concorrencia.test;

import com.caiojacintho.javacore.concorrencia.service.StoreService;
import com.caiojacintho.javacore.concorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated serviceDeprecated = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(serviceDeprecated);

    }
    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeService) {
        long startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s), executorService))
                .collect(Collectors.toList());
        List<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
        System.out.println(prices);
        long endTime = System.currentTimeMillis();
        executorService.shutdown();
        System.out.printf("Tempo passado %d%n", (endTime - startTime));
        StoreService.shutdown();
    }
}
