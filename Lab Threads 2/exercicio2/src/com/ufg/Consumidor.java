package com.ufg;

public class Consumidor implements Runnable {

    Deposito deposito;
    int intervalo;

    public Consumidor(Deposito deposito, int intervalo) {
        this.deposito = deposito;
        this.intervalo = intervalo;
    }

    @Override
    public void run() {
        System.out.println("Consumidor iniciado!");
        for (int i=0; i<=10; i++){
            if (deposito.retirar() == 1){}
            else {
                System.out.println("O consumidor não conseguiu retirar uma caixa!");
            }
            try {
                System.out.println("Intervalo do Consumidor.");
                Thread.sleep(intervalo * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
