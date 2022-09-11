package com.ufg;

public class Produtor implements Runnable {

    Deposito deposito;
    int intervalo;

    public Produtor(Deposito deposito, int intervalo) {
        this.deposito = deposito;
        this.intervalo = intervalo;
    }

    @Override
    public void run() {
        System.out.println("Produtor iniciado!");
        for (int i=0; i<=10; i++){
            if (deposito.colocar() == 1){}
            else {
                System.out.println("Produtor não conseguiu armazenar uma caixa!");
            }
            try {
                System.out.println("Intervalo do Produtor.");
                Thread.sleep(intervalo * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
