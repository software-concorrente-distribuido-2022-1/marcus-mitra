package com.ufg;

import java.util.ArrayList;
import java.util.List;

public class RabbitRun {

    public static List<Rabbit> rabbitList = new ArrayList<>();

    public static void main(String[] args) {
        rabbitAddToList("Herald");
        rabbitAddToList("Arnold");
        rabbitAddToList("Albert");

        startRunning();
    }

    public static void rabbitAddToList(String rName) {
        rabbitList.add(new Rabbit(rName));
    }

    public static void startRunning() {
        rabbitList.forEach(Thread::start); // -> while this.thread !interrupted, join().
        while (!Rabbit.interrupted()) {

        }

    }

}
