package com.ufg;

public class ThreadOne extends Thread{
    private String threadName;

    public ThreadOne(String threadName){
        this.threadName = threadName;
    }

    public void run(){
        for (int i=1; i <= 100; i++){
            System.out.println(threadName + " " + i);
        }
        System.out.println("Programa finalizado!");
    }
}
