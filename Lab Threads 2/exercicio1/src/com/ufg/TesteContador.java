package com.ufg;

import java.util.ArrayList;
import java.util.List;

public class TesteContador {

    public static void main(String[] args) {
        //Runs "Contador" that extends from Thread
        System.out.println("Primeira parte do Exercício");
        Contador contador = new Contador();
        contador.run();
        System.out.println("Contador rodou!");

        //Runs "Contador" that extends from Runnable
        System.out.println("\nSegunda parte do Exercício");
        ContadorRunnable contadorRunnable = new ContadorRunnable();
        contadorRunnable.run();
        System.out.println("ContadorRunnable rodou!");

        //Runs three instances of "Contador"
        System.out.println("\nTerceira parte do Exercício");
        List<Contador> contadorList = new ArrayList<>();
        contadorList.add(new Contador());
        contadorList.add(new Contador());
        contadorList.add(new Contador());
        contadorList.forEach(Thread::start);

    }
}
