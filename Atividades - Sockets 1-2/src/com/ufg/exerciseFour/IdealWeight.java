package com.ufg.exerciseFour;

import com.ufg.exerciseTwo.PersonSex;

import java.math.RoundingMode;

public class IdealWeight {

    public static void idealWeight(PersonExFour person) {
        double idealWeight;
        if (person.getPersonSex() == PersonSex.MALE) {
            idealWeight = (72.7 * person.getPersonHeight()) - 58;
            System.out.println(person.getPersonName() + "'s ideal weight is: " + idealWeight + "kg!\n");
        } else {
            idealWeight = (62.1 * person.getPersonHeight()) - 44.7;
            System.out.println(person.getPersonName() + "'s ideal weight is: " + idealWeight + "kg!\n");
        }
    }

}
