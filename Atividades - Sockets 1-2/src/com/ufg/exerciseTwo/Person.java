package com.ufg.exerciseTwo;

public class Person {

    private String personName;
    private PersonSex personSex;
    private int personAge;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public PersonSex getPersonSex() {
        return personSex;
    }

    public void setPersonSex(PersonSex personSex) {
        this.personSex = personSex;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public Person(String personName, PersonSex personSex, int personAge) {
        this.personName = personName;
        this.personSex = personSex;
        this.personAge = personAge;
    }

}
