package com.startjava.lesson_4.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate() {
        switch (sign) {
            case '+':
                return Math.addExact(firstNumber, secondNumber);
            case '-':
                return Math.subtractExact(firstNumber, secondNumber);
            case '*':
                return Math.multiplyExact(firstNumber, secondNumber);
            case '/':
                return Math.floorDiv(firstNumber, secondNumber);
            case '^':
                return (int) Math.pow(firstNumber, secondNumber);
            case '%':
                return firstNumber % secondNumber;
        }
        return calculate();
    }
}