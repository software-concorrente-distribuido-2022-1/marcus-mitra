package com.ufg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Rabbit extends Thread {

    private static final List<Rabbit> winnerList = new ArrayList<>();

    private String rabbitName;
    private int travelledDistance = 0;
    private int jumpsTotal = 0;
    private static final int trackLength = 20;

    public Rabbit(String rabbitName) {
        this.rabbitName = rabbitName;
    }

    public String getRabbitName() {
        return rabbitName;
    }

    public int getTravelledDistance() {
        return travelledDistance;
    }

    public int getJumpsTotal() {
        return jumpsTotal;
    }

    public synchronized void addWinnerToList(Rabbit winnerRabbit) {
        winnerList.add(winnerRabbit);
    }

    public int randomJumpDistance() {
        Random random = new Random();
        return random.nextInt(1, 4);
    }

    public void doJump(int jumpDistance) {
        this.travelledDistance += jumpDistance;
        this.jumpsTotal++;
    }

    @Override
    public void run() {
        while (travelledDistance < trackLength) {
            int jumpLength = randomJumpDistance();
            doJump(jumpLength);
            System.out.println("The rabbit "+this.getRabbitName()+" jumps "+ jumpLength +"m! "+this.getTravelledDistance()+"m travelled so far!");
            System.out.println("The rabbit "+this.getRabbitName()+" rests.");
            Thread.yield();
        }
        this.addWinnerToList(Rabbit.this);
        System.out.println("The rabbit "+this.getRabbitName()+" has finished the run!");
        try {
            this.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}