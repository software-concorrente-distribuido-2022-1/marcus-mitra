package com.ufg;

public class ContadorRunnable implements Runnable {

    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }
}
