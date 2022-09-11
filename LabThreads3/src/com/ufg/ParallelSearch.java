package com.ufg;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ParallelSearch {
    public static int parallelSearch(int targetPrime, List<Integer> primeNumbers, int threadsNumber) {

        ExecutorService executor = Executors.newFixedThreadPool(threadsNumber);
        int listSize = primeNumbers.size();
        int parcelSize = Math.floorDiv(listSize, threadsNumber);
        System.out.println("Parcel Size: " + parcelSize);
        AtomicInteger result = new AtomicInteger(-1);

        IntStream.range(0, threadsNumber).forEach(i -> {
            int initialOffset = i * parcelSize;
            int finalOffset = Math.min((i+1)*parcelSize, listSize);

            List<Integer> list = primeNumbers.subList(initialOffset, finalOffset);

            if(!executor.isShutdown()){
                executor.execute(() -> {
                    int index = tryToFindIndex(list, targetPrime, initialOffset);
                    if(index > -1){
                        executor.shutdown();
                        result.set(index);
                    }
                });
            }
        });

        try {
            if(executor.awaitTermination(60, TimeUnit.SECONDS)){
                System.out.println("All threads have finished!");
            }else{
                System.out.println("Timeout: Threads were running for more than 60 seconds!");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return result.get();
    }

    private static Integer tryToFindIndex(List<Integer> list, Integer numberToLookFor, Integer offset){
        int index = list.indexOf(numberToLookFor);
        return index > -1 ? index + offset : index;
    }
}
