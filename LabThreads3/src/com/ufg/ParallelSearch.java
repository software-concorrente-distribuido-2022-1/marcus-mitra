package com.ufg;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ParallelSearch {

    private static int index = -1;
    private static final AtomicInteger indexFound = new AtomicInteger();

    public static void setIndex(int index) {
        ParallelSearch.index = index;
    }

    private static int i = 0;

    public static int parallelSearch(int targetPrime, List<Integer> primeNumbers, int threadsNumber) {

        ExecutorService executor = Executors.newFixedThreadPool(threadsNumber);
        int listSize = primeNumbers.size();
        int parcelSize = (listSize - 1) / threadsNumber;
        System.out.println("Parcel Size: "+parcelSize);

        for (i = 0; i < threadsNumber; i++) {

            if (i == 0) {
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        if (primeNumbers.subList(0, parcelSize).contains(targetPrime)) {
                            System.out.println("Targer prime number found! Op1");
                            int indexCalc = primeNumbers.subList((parcelSize * i), (primeNumbers.size())).indexOf(targetPrime) + (parcelSize * i);
                        }
                    }
                });
            }
            if (i < threadsNumber - 1){
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        if (primeNumbers.subList((parcelSize * i), (parcelSize * (i + 1))).contains(targetPrime)) {
                            System.out.println("Targer prime number found! Op2");
                            int indexCalc = primeNumbers.subList((parcelSize * i), (primeNumbers.size())).indexOf(targetPrime) + (parcelSize * i);
                        }
                    }
                });
            }
            if (i == threadsNumber - 1) {
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        if (primeNumbers.subList((parcelSize * i), (primeNumbers.size())).contains(targetPrime)) {
                            System.out.println("Targer prime number found! Op3");
                            // setIndex(primeNumbers.subList((parcelSize * i), (primeNumbers.size())).indexOf(targetPrime));
                            // setIndex(primeNumbers.indexOf(targetPrime));
                            int indexCalc = primeNumbers.subList((parcelSize * i), (primeNumbers.size())).indexOf(targetPrime) + (parcelSize * i);
                            indexFound.set(indexCalc);
                            System.out.println("Atomic Integer Inside: "+indexFound.get());
                            System.out.println("index inside runnable: "+indexCalc);
                        }
                    }
                });
                System.out.println("The index is (inside for, inside if): "+index);
            }
            System.out.println("The index is (inside for, outside if): "+index);
        }
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (index >= 0) {
            index = indexFound.get();
            System.out.println("Atomic Integer: "+indexFound.get());
            System.out.println("The index is (outside for) FINAL: "+index);
            return index;
        }
        return -1;
    }

}
