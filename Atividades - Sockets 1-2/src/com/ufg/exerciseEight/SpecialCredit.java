package com.ufg.exerciseEight;

public class SpecialCredit {

    public static void specialCredit(Customer customer) {
        double creditGiven;
        if (customer.getCustomerAverageBalance() <= 200) {
            System.out.println(customer.getCustomerName()
                    + " isn't entitled to any credit because the average balance is less than 201! Average Balance: R$"
                    + customer.getCustomerAverageBalance());
        }
        else {
            if (customer.getCustomerAverageBalance() <= 400) {
                creditGiven = (customer.getCustomerAverageBalance() * 1.2);
                System.out.println(customer.getCustomerName()
                        + " is entitled to R$"
                        + creditGiven
                        + " in special credit for maintaining an Average Balance of: R$"
                        + customer.getCustomerAverageBalance());
            }
            else {
                if (customer.getCustomerAverageBalance() <= 600) {
                    creditGiven = (customer.getCustomerAverageBalance() * 1.3);
                    System.out.println(customer.getCustomerName()
                            + " is entitled to R$"
                            + creditGiven
                            + " in special credit for maintaining an Average Balance of: R$"
                            + customer.getCustomerAverageBalance());
                }
                else {
                    creditGiven = (customer.getCustomerAverageBalance() * 1.4);
                    System.out.println(customer.getCustomerName()
                            + " is entitled to R$"
                            + creditGiven
                            + " in special credit for maintaining an Average Balance of: R$"
                            + customer.getCustomerAverageBalance());
                }
            }
        }
    }
}
