package com.startjava.lesson_4.game;

public class Player {
    private String name;
    private String historyNumber = "";
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

    public String getHistoryNumber() {
        return historyNumber;
    }

    public void setHistoryNumber(String historyNumber) {
        this.historyNumber = historyNumber;
    }

    public int[] getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(int number, int attempt) {
        this.inputNumber[attempt] = number;
    }
}
