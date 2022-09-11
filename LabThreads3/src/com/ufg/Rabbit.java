package com.ufg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Rabbit extends Thread {

    private static final List<Rabbit> winnerList = new ArrayList<>();

    private String rabbitName;
    private int jumpLenght;
    private int travelledDistance = 0;
    private int jumpsTotal = 0;
    private static final int trackLenght = 20;

    public Rabbit(String rabbitName) {
        this.rabbitName = rabbitName;
    }

    public synchronized void addWinnerToList(Rabbit winnerRabbit) {
        winnerList.add(winnerRabbit);
    }

    @Override
    public void run() {
        while (travelledDistance < trackLenght) {
            this.jumpLenght = IntStream.range(1,4).findFirst().getAsInt();
            this.travelledDistance += this.jumpLenght;
            this.jumpsTotal++;
            System.out.println("The rabbit "+this.rabbitName+" jumps "+jumpLenght+"m! "+travelledDistance+"m travelled so far!");
            System.out.println("The rabbit "+this.rabbitName+" rests.");
            Thread.yield();
        }
        this.addWinnerToList(Rabbit.this);
        System.out.println("The rabbit "+this.rabbitName+" has finished the run!");
        try {
            this.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}