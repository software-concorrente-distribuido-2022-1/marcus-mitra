package com.ufg;

import java.util.ArrayList;
import java.util.List;

public class Deposito {
    private int items=0;
    private final int capacidade=10;
    private static final List<Consumidor> consumidorList = new ArrayList<>();
    private static final List<Produtor> produtorList = new ArrayList<>();
    private static final List<Thread> threadList = new ArrayList<>();

    public synchronized int retirar() {
        while (items <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        items--;
        System.out.println("Caixa retirada: Sobram "+items+" caixas");
        notifyAll();
        return 1;
    }

    public synchronized int colocar() {
        while (items>=capacidade) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        items++;
        System.out.println("Caixa armazenada: Passaram a ser "+items+" caixas");
        notifyAll();
        return 1;
    }

    public static void addNewConsumidor(Deposito deposito, int intervalo) {
        consumidorList.add(new Consumidor(deposito, intervalo));
    }

    public static void addNewProdutor(Deposito deposito, int intervalo) {
        produtorList.add(new Produtor(deposito, intervalo));
    }

    public static void createThreads() {
        produtorList.forEach(produtor -> {threadList.add(new Thread(produtor));});
        consumidorList.forEach(consumidor -> {threadList.add(new Thread(consumidor));});
    }

    public static void runThreads() {
        threadList.forEach(Thread::start);
    }

    public static void main(String[] args) {
        Deposito dep = new Deposito();

        //Cria produtores e consumidores
        addNewProdutor(dep, 2);
        addNewProdutor(dep, 1);
        addNewConsumidor(dep, 1);
        addNewConsumidor(dep, 3);

        // Inicia os produtores e consumidores
        // Cria as threads primeiro pois as classes "Consumidor" e "Produtor" implementam "Runnable" ao invés de extenderem Threads
        // Caso fossem Threads, eu não precisaria primeiro transformar meus produtores e consumidores em Threads e depois executá-los
        // Se eu usar o método "run", ele irá aguardar a finalização de cada método para chamar o outro, então não haveria concorrência.
        createThreads();
        runThreads();



        System.out.println("Execução do main da classe Deposito terminada!");
    }
}
