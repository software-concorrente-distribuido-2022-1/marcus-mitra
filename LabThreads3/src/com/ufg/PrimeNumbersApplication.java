package com.ufg;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersApplication {

    private static final List<Integer> primeNumbers = new ArrayList();
    private static int primeCount;
    private static long durationPrime1;
    private static long durationPrime2;
    private static long totalRunTime;

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        for (int i = 1000000; i <= 30000000; i++){
            if (isPrime(i)) {
                primeCount++;
                primeNumbers.add(i);
            }
        }
        long endTime = System.nanoTime();
        durationPrime1 = (endTime - startTime) / 1000000;

        startTime = System.nanoTime();
        for (int i = 90000000; i <= 120000000; i++){
            if (isPrime(i)) {
                primeCount++;
                primeNumbers.add(i);
            }
        }
        endTime = System.nanoTime();
        durationPrime2 = (endTime - startTime) / 1000000;

        totalRunTime = durationPrime1 + durationPrime2;

        System.out.println("Each prime number found:");
        System.out.println(primeNumbers.toString());
        System.out.println("End of the prime number's list");

        System.out.println("Prime numbers total: "+primeCount);

        System.out.println("First operation duration = "+durationPrime1+"ms");
        System.out.println("Second operation duration = "+durationPrime2+"ms");
        System.out.println("Total runtime = "+totalRunTime+"ms");

        int indexFound;
        int targetPrime = 119999987;
        long startTimeParallelSearch = System.nanoTime();
        indexFound = ParallelSearch.parallelSearch(targetPrime, primeNumbers, 5);
        long endTimeParallelSearch = System.nanoTime();
        long totalTimeParallelSearch = (endTimeParallelSearch - startTimeParallelSearch) / 1000000;
        System.out.println("Parallel search runtime: "+totalTimeParallelSearch+"ms");
        if (indexFound == -1) {
            System.out.println("Prime number not found!");
        } else {
            System.out.println("Prime number "+targetPrime+" found! The number's index is: "+indexFound);
        }



    }

}
