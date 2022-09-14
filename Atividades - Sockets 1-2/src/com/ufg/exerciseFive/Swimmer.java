package com.ufg.exerciseFive;

public class Swimmer {

    private String swimmerName;
    private int swimmerAge;

    public String getSwimmerName() {
        return swimmerName;
    }

    public void setSwimmerName(String swimmerName) {
        this.swimmerName = swimmerName;
    }

    public int getSwimmerAge() {
        return swimmerAge;
    }

    public void setSwimmerAge(int swimmerAge) {
        this.swimmerAge = swimmerAge;
    }

    public Swimmer(String swimmerName, int swimmerAge) {
        this.swimmerName = swimmerName;
        this.swimmerAge = swimmerAge;
    }

}
