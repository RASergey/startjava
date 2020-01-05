package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private StringBuilder historyNumber = new StringBuilder(" ");
    private int attempt;
    private int[] inputNumber = new int[10];

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

    public int getInputNumber() {
        return inputNumber[attempt];
    }

    public int[] getInputNumbers() {
        return inputNumber;
    }

    public void setInputNumber(int number) {
        inputNumber[attempt] = number;
    }

    public StringBuilder getHistoryNumber() {
        return historyNumber;
    }

    public void setHistoryNumber(int[] number) {
        historyNumber.append(Arrays.toString(number));
    }
}