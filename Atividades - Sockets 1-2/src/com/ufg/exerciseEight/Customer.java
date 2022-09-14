package com.ufg.exerciseEight;

public class Customer {

    private String customerName;
    private int customerAverageBalance;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAverageBalance() {
        return customerAverageBalance;
    }

    public void setCustomerAverageBalance(int customerAverageBalance) {
        this.customerAverageBalance = customerAverageBalance;
    }

    public Customer(String customerName, int customerAverageBalance) {
        this.customerName = customerName;
        this.customerAverageBalance = customerAverageBalance;
    }

}
