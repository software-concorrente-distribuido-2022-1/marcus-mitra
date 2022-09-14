package com.ufg.exerciseNine;

public enum PlayingCardValues {
    ÁS(1),
    DOIS(2),
    TRÊS(3),
    QUATRO(4),
    CINCO(5),
    SEIS(6),
    SETE(7),
    OITO(8),
    NOVE(9),
    DEZ(10),
    VALETE(11),
    DAMA(12),
    REI(13);

    private int cardValue;

    private PlayingCardValues(int cardValue) {
        this.cardValue = cardValue;
    }

    public int getCardValue() {
        return cardValue;
    }

    public static PlayingCardValues fromCardValue(int cardValue) {
        for (PlayingCardValues type : values()) {
            if (type.getCardValue() == cardValue) {
                return type;
            }
        }
        return null;
    }
}
