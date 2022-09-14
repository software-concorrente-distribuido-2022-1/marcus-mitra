package com.ufg.exerciseTwo;

public class IsPersonOfAge {

    public static void isPersonOfAge(Person person) {
        switch (person.getPersonSex()) {
            case MALE:
                if (person.getPersonAge() >= 18) {
                    System.out.println(person.getPersonName()+" already reached the age of majority. \n");
                } else {
                    System.out.println(person.getPersonName()+" haven't reached the age of majority. \n");
                }
                break;

            case FEMALE:
                if (person.getPersonAge() >= 21) {
                    System.out.println(person.getPersonName()+" already reached the age of majority. \n");
                } else {
                    System.out.println(person.getPersonName()+" haven't reached the age of majority. \n");
                }
                break;
        }
    }

}
