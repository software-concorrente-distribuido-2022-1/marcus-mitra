package com.ufg;

public class Main {

    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne("Thread 1");
        threadOne.start();
    }
}
