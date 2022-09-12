package com.ufg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class RabbitApplication {
    public static void main(String[] args) {
        List<String> rabbits = List.of("Albert", "Harold", "Robert");

        Run run = new Run(rabbits, 20);

        run.startRun();
    }
}

class Run {
    private final List<Runner> runners;
    private final int runDistance;
    private final List<Runner> podium;


    public Run(List<String> rabbits, int runDistance) {
        this.runners = rabbits.stream().map(Runner::new).toList();
        this.runDistance = runDistance;
        this.podium = new ArrayList<>();
    }

    public void startRun() {
        ExecutorService executor = Executors.newFixedThreadPool(runners.size());

        runners.forEach(runner -> executor.execute(() -> startRunner(runner)));

        printWinners();

        executor.shutdown();
    }

    private void startRunner(Runner runner) {
        while (!podium.contains(runner)) {
            runner.jump();
            if (runner.getTraveledDistance() >= this.runDistance) {
                podium.add(runner);
            } else {
                Thread.yield();
            }
        }
    }

    private void printWinners() {
        AtomicInteger i = new AtomicInteger();

        podium.forEach(winner ->
                System.out.println(
                        i.incrementAndGet() + " - " + winner.getStatus())
        );
    }
}

class Runner {
    private final String name;
    private int traveledDistance;
    private int numberOfJumps;


    public Runner(String name) {
        this.traveledDistance = 0;
        this.name = name;
        this.numberOfJumps = 0;
    }

    public int getTraveledDistance() {
        return this.traveledDistance;
    }

    public void jump() {
        Random random = new Random();
        int jump = random.nextInt(1, 4);
        this.traveledDistance += jump;
        this.numberOfJumps++;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfJumps() {
        return this.numberOfJumps;
    }

    public String getStatus() {
        return this.getName()
                + ": "
                + this.getNumberOfJumps()
                + " jumps, running "
                + this.getTraveledDistance()
                + " meters";
    }
}