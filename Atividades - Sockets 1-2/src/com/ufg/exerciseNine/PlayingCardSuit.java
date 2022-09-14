package com.ufg.exerciseNine;

public enum PlayingCardSuit {
    OUROS(1),
    PAUS(2),
    COPAS(3),
    ESPADAS(4);

    private int suitValue;

    private PlayingCardSuit(int suitValue) {
        this.suitValue = suitValue;
    }

    public int getSuitValue() {
        return suitValue;
    }

    public static PlayingCardSuit fromCardSuit(int suitValue) {
        for (PlayingCardSuit type : values()) {
            if (type.getSuitValue() == suitValue) {
                return type;
            }
        }
        return null;
    }
}
