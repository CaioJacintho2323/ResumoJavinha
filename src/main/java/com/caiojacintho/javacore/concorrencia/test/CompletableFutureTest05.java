
package com.caiojacintho.javacore.concorrencia.test;

import com.caiojacintho.javacore.concorrencia.dominio.Quote;
import com.caiojacintho.javacore.concorrencia.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest05 {
    public static void main(String[] args) {
        StoreServiceWithDiscount storeServiceWithDiscount = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsync(storeServiceWithDiscount);

    }

    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount storeServiceWithDiscount) {
        long startTime = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        var array = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeServiceWithDiscount.getPriceSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> storeServiceWithDiscount.applyDiscount(quote))))
                .map(cf -> cf.thenAccept(store -> System.out.printf("%s finished in %d ms %n", store, System.currentTimeMillis() - startTime)))
                .toArray(CompletableFuture[]::new);

//        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(array);
        CompletableFuture<Object> voidCompletableFuture = CompletableFuture.anyOf(array);
        voidCompletableFuture.join();
        System.out.printf("Finished? %b%n",voidCompletableFuture.isDone() );

        long endTime = System.currentTimeMillis();
        System.out.printf("Tempo passado %d%n", (endTime - startTime));


    }
}
