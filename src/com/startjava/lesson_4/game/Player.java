package com.startjava.lesson_4.game;

public class Player {
    private String name;
    private int number;
    private String historyNumber = "";
    private int[] inputNumber = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public void setInputNumber(int number, int index) {
        this.inputNumber[index] = number;
    }
}
