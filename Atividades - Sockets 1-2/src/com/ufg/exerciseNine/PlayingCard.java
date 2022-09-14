package com.ufg.exerciseNine;

import java.util.Arrays;

public class PlayingCard {

    private int cardValue;
    private int cardSuit;

    @Override
    public String toString() {
        PlayingCardValues playingCardValues = PlayingCardValues.fromCardValue(this.getCardValue());
        PlayingCardSuit playingCardSuits = PlayingCardSuit.fromCardSuit(this.getCardSuit());
        return "Nome da carta: " +
                playingCardValues +
                " DE " + playingCardSuits;
    }

    public PlayingCard(int cardValue, int cardSuit) {
        this.cardValue = cardValue;
        this.cardSuit = cardSuit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public int getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(int cardSuit) {
        this.cardSuit = cardSuit;
    }
}
