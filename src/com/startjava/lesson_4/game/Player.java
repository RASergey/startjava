package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private StringBuilder historyNumbers = new StringBuilder();
    private int attempt;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }

    public void setEnteredNumber(int number) {
        enteredNumbers[attempt] = number;
    }

    public String getHistoryNumbers() {
        return historyNumbers.toString();
    }

    public int LastNumber() {
        return enteredNumbers[attempt - 1];
    }

    public void addAllNumbers() {
        historyNumbers.append(Arrays.toString(Arrays.copyOf(enteredNumbers, attempt)));
    }

    public void clearHistoryNumbers() {
        historyNumbers.setLength(0);
    }
}