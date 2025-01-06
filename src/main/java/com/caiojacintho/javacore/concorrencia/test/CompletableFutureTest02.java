package com.caiojacintho.javacore.concorrencia.test;

import com.caiojacintho.javacore.concorrencia.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricesAsyncCompletableFuture(storeService);

    }
    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long startTime = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(storeService::getPriceAsyncCompletableFuture)
                .collect(Collectors.toList());
        completableFutures.stream().map(CompletableFuture::join).forEach(System.out::println);
        long endTime = System.currentTimeMillis();
        System.out.printf("Tempo passado %d%n", (endTime - startTime));
        StoreService.shutdown();
    }
}
