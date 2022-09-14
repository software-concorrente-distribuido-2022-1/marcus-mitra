package com.ufg.exerciseFour;

import com.ufg.exerciseTwo.PersonSex;

public class PersonExFour {

    private String personName;
    private double personHeight;
    private PersonSex personSex;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public double getPersonHeight() {
        return personHeight;
    }

    public void setPersonHeight(double personHeight) {
        this.personHeight = personHeight;
    }

    public PersonSex getPersonSex() {
        return personSex;
    }

    public void setPersonSex(PersonSex personSex) {
        this.personSex = personSex;
    }

    public PersonExFour(String personName, double personHeight, PersonSex personSex) {
        this.personName = personName;
        this.personHeight = personHeight;
        this.personSex = personSex;
    }
}
