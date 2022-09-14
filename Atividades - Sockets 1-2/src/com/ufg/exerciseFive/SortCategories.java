package com.ufg.exerciseFive;

public class SortCategories {

    public static void sortCategories(Swimmer swimmer) {
        if (swimmer.getSwimmerAge() < 5) {
            System.out.println("Swimmer " + swimmer.getSwimmerName() + " is too young!\n");
        }
        else {
           if (swimmer.getSwimmerAge() <= 7) {
               System.out.println("Swimmer " + swimmer.getSwimmerName() + " is in the children's category A!\n");
           }
           else {
               if (swimmer.getSwimmerAge() <= 10) {
                   System.out.println("Swimmer " + swimmer.getSwimmerName() + " is in the children's category B!\n");
               }
               else {
                   if (swimmer.getSwimmerAge() <= 13) {
                       System.out.println("Swimmer " + swimmer.getSwimmerName() + " is in the juvenile category A!\n");
                   }
                   else {
                       if (swimmer.getSwimmerAge() <= 17) {
                           System.out.println("Swimmer " + swimmer.getSwimmerName() + " is in the juvenile category B!\n");
                       }
                       else {
                           System.out.println("Swimmer " + swimmer.getSwimmerName() + " is in the adult's category!\n");
                       }
                   }
               }
           }
        }
    }

}
